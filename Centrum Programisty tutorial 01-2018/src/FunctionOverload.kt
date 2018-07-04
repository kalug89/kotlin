fun sum(a:Int, b:Int):Int{
    return a+b
}

fun sum(a:Int, b:Int, c:Int):Int{
    return a+b+c
}

fun sum(a:Int, b:Int, c:Int, d:Int):Int{
    return a+b+c+d

}

fun sum(a:Int, b:Int, c:Int, d:Int, e:Int):Int {
    return a + b + c + d + e
}

fun main(args:Array<String>){

    println(sum(4,5))
    var sumnumber = sum(2,3,5,7,8)
    println("Sum numbers $sumnumber")

    var summing = sum(4,5 + sum(5,3,6))
    println(summing)


}

