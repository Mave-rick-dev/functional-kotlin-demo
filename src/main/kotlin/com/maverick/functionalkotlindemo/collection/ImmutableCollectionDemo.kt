package com.maverick.functionalkotlindemo.collection

class ImmutableCollectionDemo

fun main() {
    val immutList = listOf<String>("hello", "world")
    println(immutList)

    /*val immutMap = mapOf<Int, String>(1 to "hero", 2 to "hera", 3 to "lal")
    println(immutMap)

    val immutMap2 = HashMap<Int, String>()
    println(immutMap)*/

    /**
     *  Set can hold redundant values but does not process as such
     */
    val immutSet = setOf<Int>(2, 31, 44, 53, 64, 74, 8, 9, 10, 11, 11, 13)
    for (element in immutSet) {
        println(element)
    }


}
