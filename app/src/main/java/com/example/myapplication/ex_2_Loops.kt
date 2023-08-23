package com.example.myapplication

fun main() {
    // for each

    val items = listOf("apple", "bannana", "orange") // List.of() Java 9
    mutableListOf("apple", "banana", "orange") // ArrayList

    for (item in items)
        println(item)

    // while
    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }


    // Diapasons
    println( 3 in 2..10) // true

    for (i in 1..10)
        println(i)
        println()

    for (i in 1 until 10)

    for (i in 10 downTo 1)
        println(i)
        println()

    for (i in 0..100 step 10)
        println(i)
        println()
}