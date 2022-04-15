package com.maverick.functionalkotlindemo.nullSafety

class LazyDemo

val gravity: Float by lazy {
    9.80665f
}

fun main() {
    println("hello $gravity")
}
