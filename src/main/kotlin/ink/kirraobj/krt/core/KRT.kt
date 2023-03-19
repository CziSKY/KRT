package ink.kirraobj.krt.core

import ink.kirraobj.krt.core.predicate.Predicate

class KRT<T, P : Predicate<T>>(private val value: T, private val predicate: P) {

    fun refinedOrNull(): T? {
        if (!predicate.invoke(value)) {
            return null
        }
        return value
    }

    fun refinedOrError(): T {
        require(predicate.invoke(value)) { "Value $value doesn't match the predicate" }
        return value
    }
}