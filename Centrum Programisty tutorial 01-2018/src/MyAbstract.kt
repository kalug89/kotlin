abstract class Name(){
    fun getName():String{
        return "Mike Tyson"
    }
    fun getAge():Int{
        return 46
    }


}


class userName(): Name(){
    fun name():String{
        return getName()
    }
}

fun main(args: Array<String>){
    var user = userName()
    println(user.name())
}