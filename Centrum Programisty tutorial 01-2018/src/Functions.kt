fun sum(a:Double, b:Double):Double{
    return a+b
}
fun multiply(a:Int, b:Int):Int{
    return a * b
}
fun display(n:Int){
    println("n: $n")
}
fun displayWithnoUnit():Unit{
    println("Error")
}

fun main(args: Array<String>) {
    println(sum(2.5, 1.2))
    println(multiply(4,4))
    display(44)
    displayWithnoUnit()
}
