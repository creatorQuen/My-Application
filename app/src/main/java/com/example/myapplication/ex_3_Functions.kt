package com.example.myapplication

fun main() {
    println(testSimple()) //10
    println(testSimple1(4, 4)) // 8
    println(testString(5)) // String is 5

    testNamedArguments(y = 4, z = 2, x = 5)

    tetDefaultArguments() // 3
    tetDefaultArguments(y = 1) // 2
    tetDefaultArguments(3, 5) // 8

    println()
    printEven(1, 2, 3, 4, 5)
    printEven(*intArrayOf(1,2,3,4,5), 6 ,6 ,7, 7)
}

fun testSimple(): Int {
    return 6 + 6
}

fun testSimple1(x: Int, y: Int): Int = x + y

fun testSimple2(x: Int, y: Int) = x + y

fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

fun tetDefaultArguments(x: Int = 1, y: Int = 2) {
    println(x + y)
}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) {
    (if (toUpperCase) name.toUpperCase() else name) + number
}

// vararg
fun printEven (vararg numbers: Int) {
    numbers.forEach {e -> if (e % 2 == 0) println(e)}
}