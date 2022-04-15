package com.maverick.functionalkotlindemo

class TestingTesting {
    /**
     * Higher order function that takes lambda as a param
     */
    fun calculate(num1: Int, num2: Int, action: (Int) -> Unit) {
        val sum = num1 + num2
        action(sum)
    }
}

fun main() {
    // the lambda param
    val lambdaParam: (Int) -> Unit = { num: Int -> println(num) }
    val testingTesting: TestingTesting = TestingTesting()
    testingTesting.calculate(1, 2, lambdaParam)
}


