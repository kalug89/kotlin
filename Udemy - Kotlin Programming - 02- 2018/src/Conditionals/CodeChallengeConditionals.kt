package Conditionals


fun main(args: Array<String>) {

    val random = 10

    when (random) {
        in 1..10 -> println("random is 1-10")
        else -> println("Else")
    }

}

