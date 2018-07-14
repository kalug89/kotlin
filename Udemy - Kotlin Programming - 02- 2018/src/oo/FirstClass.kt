package oo

import function.getCurrentDate
import oo.Color.BLUE
import java.math.BigInteger

class Person(val name: String, var age: Int) {

    init {
        println("Object was created")
        val bigInt = BigInteger("3")
        val currentDate = getCurrentDate()

        val blue = BLUE
    }

    fun speak() {
        println("Hello")
    }

    fun greet(name: String) {
        println("Hello $name")
    }

//    fun getYearOfBirth():Int{
//        return 2016 - age
//    }

    fun getYearOfBirth() = 2016 - age
}

fun main(args: Array<String>) {
    val person = Person("Jack", 17)

    person.speak()
    person.greet("world")
    println(person.getYearOfBirth())
    println(person.name)
    println(person.age)
}
