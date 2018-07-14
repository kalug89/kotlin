package function

import java.util.*

//No parameters, no return value
fun helloWorld() {
    println("Hello world!")
    val list = listOf(1,2,3)
}

// 1 parameter, no return value
fun printWithSpaces(text: String) {
    for (char in text) {
        print(char + " ")
    }
    println()
}

//No parameters, return Date
fun getCurrentDate(): Date {
    return Date()
}

//2 parameters, return Int
fun max(a: Int, b: Int): Int {
    if (a >= b) {
        return a
    } else {
        return b
    }
}

fun main(args: Array<String>) {
    println(printWithSpaces("Kotlin is awesome"))
    println(getCurrentDate())
    println(max(333, 222))
}
