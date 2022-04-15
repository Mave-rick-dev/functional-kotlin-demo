package com.maverick.functionalkotlindemo.core

class HigherOrderFunctionDemo {

    // conventional
    fun addTwoNumbers(num1: Int, num2: Int) {
        val sum = num1 + num2
        println(sum)
    }

    // fun interface as a param
    fun addTwoNumbers(num1: Int, num2: Int, action: TestInterface) {
        val sum = num1 + num2
        action.execute(sum)
    }

    // high-level fun with lambda as a param
    fun addTwoNumbers(num1: Int, num2: Int, action: (Int) -> Unit) {
        val sum = num1 + num2
        action(sum)
    }

    // high-level fun with lambda as a return type
    fun addTwoNumbers2(num1: Int, num2: Int): (Int) -> Unit {
        val sum = num1 + num2
        val myLambda: (Int) -> Unit = { num: Int -> println(num) }
        return myLambda
    }
}

fun main() {
    val higherOrderFunctionDemo: HigherOrderFunctionDemo = HigherOrderFunctionDemo()
    // higherOrderFunctionDemo.addTwoNumbers(1, 2)

    // with interface
    higherOrderFunctionDemo.addTwoNumbers(
        1, 2,
        object : TestInterface {
            override fun execute(sum: Int) {
                println(sum)
            }
        }
    )
    // passing named function as param
    // first, we need a fun with ..."
    fun useAsParam(num: Int) {
        // some logic
    }
    higherOrderFunctionDemo.addTwoNumbers(1, 2, ::useAsParam)

    // with lambda
    // first, we need a lambda with int as param and Unit as return type
    val myLambda: (Int) -> Unit = { num: Int -> println(num) }
    myLambda(1)
    higherOrderFunctionDemo.addTwoNumbers(1, 2, myLambda)
}

interface TestInterface {
    fun execute(num: Int)
}
