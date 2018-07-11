package loops

fun main(args: Array<String>) {

/* For this challenge, try to write a program that calculates the sum of all
numbers from 100 to 100,000 and prints out the result.
*/

    var sum = 0
    for (x in 1..100000) {
        sum = x + x
        println(sum)
    }
}
