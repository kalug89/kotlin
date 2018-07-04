package simpleclass

fun main(args: Array<String>){
    var Bmw = Car("Bmw", "E36", "Seba", 12500)
    println(Bmw)
    println(Bmw.gType())
    println(Bmw.gType())

    var HONDA = Car("Honda", "Civic", "Mike", 2000)
    println(HONDA.gType() + " " + HONDA.gModel())

    var MERCEDES = Car("Mercedes", "Execute", "Bill Gates", 125000)
    println(MERCEDES.Model)

    var person = Person("Michał", "Kichał")


}
