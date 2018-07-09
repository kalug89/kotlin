package Conditionals

fun main(args: Array<String>) {
    val mode: Int = 3

    val result = when (mode) {
        1 -> "The mode is lazy"
        2 -> {
            println("The mode is 2")
            val i: Int = 3
            "So the mode is busy"
        }
        3 -> "The mode is super-productive."
        else -> "I don't know that mode"
    }
    println(result)

    val x = if (mode < 2) {
        println("Mode is less than 2")
        17
    } else {
        42
    }

    println(x)
}
