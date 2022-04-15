package com.maverick.functionalkotlindemo.nullSafety

class NullSafetyOperators

fun main() {
    /**
     * Kotlin by default avoids null value
     */
    val name: String? = null

    val newName: String? = "hello"
    // ?. : When it is okay to forward null value
    /*println(name?.length)
    println(newName?.length)*/

    // ?.let{...} : Won't execute the let block when name is null and vice-versa
    //  and handles the NullPointerException
    /*newName?.let {
        println(newName.length)
    }
*/
    // ?:
   /* if (name != null) {
        name.length
    } else {
        -1
    }*/
    /*val len = newName?.length ?: -1
    // val len2 = newName?.length ?: -1
    println(len)
*/
    // !!
    /*val len = name!!.length
    println(len)*/
}
