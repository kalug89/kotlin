class UserInfo<T> (user:T){

    init{
        println(user)
    }
}

fun <T> showPrintln(show:T){
    println(show)
}


fun main(args:Array<String>){
    var userInfo = UserInfo<String>("Andrzej")
    var userInfo2 = UserInfo<Int>(26)
    var userInfo3 = UserInfo<Double>(234.5)

    println(22)
    println(23.4f)
    println("Hello")
    println(66666L)

}