package oo

abstract class Persons(open val name: String, open var age: Int) {

    abstract fun speak()
    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2016 - age
}

class Student(override val name: String, override var age: Int, val studentId: Long) : Persons(name, age) {
    fun isIntelligent() = true

    override fun speak() {
        println("Hi there, I;m student")
    }

}

class Employee(override val name: String, override var age: Int) : Persons(name, age) {

    fun recievePayment() {
        println("Recived payment")
    }

    override fun speak() {
        println("Hi I'm employee")
    }
}

fun main(args: Array<String>) {
    val student = Student("Jogn", 32, 345345)
    student.speak()

    println(student.isIntelligent())

    val employee = Employee("Mary", 32)
    employee.getYearOfBirth()

    employee.recievePayment()
    employee.speak()
}
