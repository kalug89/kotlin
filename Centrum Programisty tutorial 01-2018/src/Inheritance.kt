open class Operations {
    var time:Int = 24
    protected var name:String = "Name"
    open fun sum(a: Int, b: Int): Int {
        return a + b
    }

    open fun div(a: Int, b: Int): Int {
        return a / b
    }
}

class MultiOperations:Operations{

    constructor(){
        super.time
        super.sum(2,2)
    }

    override fun sum(a: Int, b: Int): Int {
        return a + b * 3
    }

    override fun div(a:Int, b:Int):Int{
        return a/b + 3
    }

     fun sub(a:Int, b:Int):Int{
        return a-b
    }

    fun mul(a:Int, b:Int):Int{
        return a * b
    }
    fun getName(){
        super.name
    }
}
fun main(args: Array<String>){
 var multiOperations = MultiOperations() as Operations
    println(multiOperations.div(9,3))
    println(multiOperations.sum(3,3))
    println(multiOperations.sum(3,4))
}
