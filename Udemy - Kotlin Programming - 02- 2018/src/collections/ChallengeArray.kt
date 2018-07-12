package collections


/*
Create an array list of your favorite book titles.
Loop over this list and, if the title contains the letter ‘e’,
print each character of the name on a new line.
 */

fun main(args: Array<String>) {

    val list = arrayListOf("King kong", "e", "Dziady", "Lalka")
    println(list)

    if (list.contains("e")){
        println(list.contains("e"))
    } else {
        println("nothing")
    }

}