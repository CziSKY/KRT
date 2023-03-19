package ink.kirraobj.krt

import ink.kirraobj.krt.core.predicate.impl.Positive
import ink.kirraobj.krt.core.refined

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val positive = -123 refined Positive
        println(positive.refinedOrError())
    }
}