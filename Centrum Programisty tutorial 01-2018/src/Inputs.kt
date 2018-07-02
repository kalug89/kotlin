fun main(args:Array<String>) {

    println("Enter your name")
    var name:String?= readLine()

    println("Enter your age")
    var age:Int = readLine()!!.toInt()

    println("Enter your pi")
    var pi:Double = readLine()!!.toDouble()

    println("Enter float")
    var float:Float = readLine()!!.toFloat()

    println("Enter Company")
    var company:String = readLine().toString()
    println(name + " " + age + " " + pi + " " + float)

    println(company)
}
