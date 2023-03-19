package ink.kirraobj.krt.core.predicate.impl

import ink.kirraobj.krt.core.predicate.Predicate

object Positive : Predicate<Int> {

    override fun invoke(value: Int) = value > 0
}