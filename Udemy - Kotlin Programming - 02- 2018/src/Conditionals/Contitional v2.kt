package Conditionals

fun main(args: Array<String>) {
    val x = 10
    when (x){
        5 -> println("x is 5")
        3*2 -> println("x is 3*12")
        "Hey there".length -> println("x is the lenght of the string")
        in 1..10 -> println ("x is between 1 and 10")
        in 11..20 -> println()
        in 21..30 -> println()
        !in 1..9 -> println("x is not between 1 to 9")



    }
}