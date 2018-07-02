fun main(args: Array<String>) {

    var myFavouriteSerial: String = "Games of Thrones"
    println(myFavouriteSerial)
    println("Serial " + myFavouriteSerial)
    println("Serial: $myFavouriteSerial")

    var unHappy:String = "Happy " + "unhappy" + myFavouriteSerial
    println(unHappy)
    println("Second char: $myFavouriteSerial[1]")
    println("Second char: " + myFavouriteSerial[1])
    println("Serial: " + myFavouriteSerial.trim())
    println("Serial: " + myFavouriteSerial.toUpperCase())
    println("Serial: " + myFavouriteSerial.toLowerCase())
    println("Serial: " + myFavouriteSerial.split(" "))
    println("Serial: " + myFavouriteSerial.length)
}
