package Conditionals

fun main(args: Array<String>) {
    val mode: Int = 5

    when (mode) {
        1 -> println("The mode is lazy")
        2 -> {
            println("The mode is 2")
            println("So the mode is busy")
        }
        3 -> println("The mode is super-productive.")
        else -> println("I don't know that mode")
    }

    
}