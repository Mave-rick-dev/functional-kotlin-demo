package com.maverick.functionalkotlindemo.collection

class ArrayDemo

fun main() {
    // Array initialization
    /**
     *  Array<DataType>(size: Int) {//default value in all indexes}
     *      - size => fixed size
     *      - offers arrayInstance.set(index: Int, value: Int) => mutable
     */
    val arrayTest2 = Array(4) { 1 }
    arrayTest2[0] = 3
    for (num in arrayTest2) {
        println(num)
    }
    arrayTest2.forEach { println(it) }
}
