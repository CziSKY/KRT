package ink.kirraobj.krt.core

import ink.kirraobj.krt.core.predicate.Predicate

infix fun <T, P : Predicate<T>> T.refined(predicate: P): KRT<T, P> {
    return KRT(this, predicate)
}