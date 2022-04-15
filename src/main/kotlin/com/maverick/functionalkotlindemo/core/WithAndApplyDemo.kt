package com.maverick.functionalkotlindemo.core

class WithAndApplyDemo {
    var name: String = ""
    var age: Int = -1

    fun printNameAge() {
        println("$name $age")
    }
}
fun main() {
    val withAndApplyDemo = WithAndApplyDemo()

    // conventional
    withAndApplyDemo.name = "new name"
    withAndApplyDemo.age = 24

    println(withAndApplyDemo.name + " " + withAndApplyDemo.age)

    // WITH demo
    with(withAndApplyDemo) {
        // some logic
        name = "new name"
        age = 25
    }

    println(withAndApplyDemo.name + " " + withAndApplyDemo.age)

    // APPLY demo
    withAndApplyDemo.apply {
        name = "new name"
        age = 25
    }.printNameAge()
}
