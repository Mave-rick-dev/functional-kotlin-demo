package com.maverick.functionalkotlindemo.collection

class MmutableCollectionDemo

fun main() {

    /**
     *  Array<DataType>(size: Int) {//default value in all indexes}
     *      - size => fixed size
     *      - offers arrayInstance.set(index: Int, value: Int) => mutable
     */
   /* val arrayTest2 = Array(4) { 1 }
    arrayTest2[0] = 3
    for (num in arrayTest2) {
        println(num)
    }
    arrayTest2.forEach { println(it) }*/

    // arrayListOf()
   /* val arrayListDemo = arrayListOf<String>("apple", "mango")
    // arrayListDemo[2] = "sano ammba"
    arrayListDemo[1] = "aammba"
    println(arrayListDemo)*/

    // mutableListOf()
    /*val mutList = mutableListOf<String>("suntala", "kera")
    mutList.add(2, "what what")
    mutList.forEach { println(it) }*/

    // hashdOf()
    val mutHashMap = hashMapOf<Int, String>(1 to "hello", 2 to "world")
    mutHashMap[1] = "new hello"
    mutHashMap.remove(2)
    mutHashMap.forEach { println(it) }

    // mutableSetOf()
   /* val mutSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 5, 6)
    mutSet.add(7)
    mutSet.remove(7)
    mutSet.forEach { println(it) }*/

    // hashSetOf()
    // only difference is it does not guarantee set's insert order
  /*  val mutHashSet = hashSetOf<Int>(1, 2, 33, 45, 53, 53, 56)
    mutHashSet.add(99)
    mutHashSet.remove(99)
    mutHashSet.forEach { println(it) }*/
}
