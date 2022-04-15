package com.maverick.functionalkotlindemo.collection

class FilterAndMapDemo

fun main() {
    val testInts = listOf<Int>(1, 2, 3, 4, 5, 6, 7)
    val filteredInts = testInts.filter {
        it < 5
    }
    // filteredInts.forEach { println(it) }

    filteredInts.map { it * it }.forEach { println(it) }

}
