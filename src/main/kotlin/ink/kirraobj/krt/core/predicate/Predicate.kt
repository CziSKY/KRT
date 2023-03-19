package ink.kirraobj.krt.core.predicate

interface Predicate<T> {

    fun invoke(value: T): Boolean
}