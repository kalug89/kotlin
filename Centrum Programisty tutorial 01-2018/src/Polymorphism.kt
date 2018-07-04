
fun show(name:String):Unit{
    println(name)
}

fun show(name:Int):Unit{
    println(name)
}

fun show(pi:Double):Unit{
    println(pi)
}

fun show(Float:Float):Unit{
    println(Float)
}



fun main(args: Array<String>) {
    show(3.14)
    show("Mike Tyson")
    show(45)
    show(2.3f)


}