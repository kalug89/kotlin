package oo

interface Driveable {
    fun drive()
}

interface Buildable {
    val timeRequired: Int
    fun build()
}

class Car(val color: Color) : Driveable, Buildable {
    override val timeRequired = 120

    override fun drive() {
        println("Driving car.")
    }

    override fun build() {
        println("Built a shiny car.")
    }
}

class MotoCycle(val color: String) : Driveable {
    override fun drive() {
        println("Driving motocycle.")
    }
}

fun main(args: Array<String>) {
    val car: Car = Car(Color.GREEN)
    println(car.color)
    car.drive()
    val motoCycle: Driveable = MotoCycle("red")
    motoCycle.drive()
}
