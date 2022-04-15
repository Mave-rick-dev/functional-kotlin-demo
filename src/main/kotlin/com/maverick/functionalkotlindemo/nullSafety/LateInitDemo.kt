package com.maverick.functionalkotlindemo.nullSafety

class LateInitDemo {
    lateinit var name: String

  /*  fun accessName() {
        name = "inside fun..."
        println(name)
    }*/
}
fun main() {
    val lateInitDemo = LateInitDemo()
    // println(lateInitDemo.name)
    lateInitDemo.name = "new name"
    println(lateInitDemo.name)

    // lateInitDemo.accessName()
}
