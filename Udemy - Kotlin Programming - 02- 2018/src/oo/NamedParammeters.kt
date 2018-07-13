package oo

class House(val height: Double, val color: String, val price: Int = 5000) {
    fun print() {
        println("House [height=$height, color=$color, price=$price]")
    }
}



fun main(args: Array<String>) {
    val hause = House(height = 4.5, color = "BLue", price = 15000)
    val redHouse = House(color = "red", price = 200000, height = 5.0)
    val yellowHouse = House(color = "Yellow", height = 2.5)

    hause.print()
    redHouse.print()
    yellowHouse.print()
}
