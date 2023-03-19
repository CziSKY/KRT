# KRT

> *Refinement types. In type theory, a refinement type is a type endowed with a predicate which is assumed to hold for any element of the refined type.*

Inspired by [Krefty](https://github.com/ustits/krefty), KRT (Kotlin Refinement Type) is a toy I wrote to prove that Kotlin can also implement Refinement Types like Scala.

It doesn't have any compile-time buff (I haven't mastered the skill of writing compiler plugins, shame on me), and I didn't want to put the time into fully implementing it, but it's simple enough that even an elementary school student could probably understand it.

```kotlin
    @JvmStatic
    fun main(args: Array<String>) {
        val positive = -123 refined Positive
        println(positive.refinedOrError())
        // java.lang.IllegalArgumentException: Value -123 doesn't match the predicate
    }
```
