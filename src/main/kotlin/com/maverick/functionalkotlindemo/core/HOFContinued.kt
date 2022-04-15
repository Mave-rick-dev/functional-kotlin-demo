package com.maverick.functionalkotlindemo.core

class HOFContinued {

    fun calculate(num1: Int, num2: Int, lambdaParam: (Int, Int) -> Int) {
        val sum = lambdaParam(num1, num2)
        println(sum)
    }
}

fun main() {
    val lambda: (Int, Int) -> Int = { num1: Int, num2: Int -> num1 + num2 }

    val hofContinued: HOFContinued = HOFContinued()
    hofContinued.calculate(1, 2, lambda)
}
