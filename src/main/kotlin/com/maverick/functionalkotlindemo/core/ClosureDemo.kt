package com.maverick.functionalkotlindemo.core

class ClosureDemo

fun main() {
    var name: String = "hello"

    val testLambda: (String) -> Unit = { s: String ->
        println("input string: $s")
        name = "new hello"
        println(name)
    }

    testLambda("What what")
}
