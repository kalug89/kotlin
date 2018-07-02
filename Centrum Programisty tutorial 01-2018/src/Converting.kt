fun main(args:Array<String>) {

    var age1:Int = 16
    var age2:Int?
    var age5String = "12"

    age2 = age5String.toInt()

    var float:Float?

    float = age5String.toFloat()

    var double:Double= 3.14


    println(float)
    println(age2)

    age2= double.toInt()

    println(age2)
}