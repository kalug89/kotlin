package oo

open class Persons(open val name: String, open var age: Int) {

    init {
        println("Object was created")
    }

    fun speak() {
        println("Hello")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2016 - age
}

class Student(override val name: String, override var age: Int, val studentId: Long) : Persons(name, age) {
    fun isIntelligent() = true

}

class Employee(override val name: String, override var age: Int) : Persons(name, age) {

    fun recievePayment() {
        println("Recived payment")
    }

}

fun main(args: Array<String>) {
    val student = Student("Jogn", 32, 345345)
    student.speak()

    println(student.isIntelligent())

    val employee = Employee("Mary", 32)
    employee.getYearOfBirth()

    employee.recievePayment()
}
