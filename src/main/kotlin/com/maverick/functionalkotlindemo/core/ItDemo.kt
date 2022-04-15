package com.maverick.functionalkotlindemo.core

class ItDemo {
    fun reverseAndPrint(str: String, lParam: (String) -> String) {
        val reversedString = lParam(str)
        println(reversedString)
    }
}

fun main() {

    val program = ItDemo()
    program.reverseAndPrint("Om") { it.reversed() }

    val fruitList = listOf(1, "hello", 2, "world")
    fruitList.stream().forEach {
        if (it.equals("hello")) {
            println(it)
        }
    }
}
