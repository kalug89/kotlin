import java.util.*

fun main(args:Array<String>) {
    var year:Int = Calendar.getInstance().get(Calendar.YEAR)

    println("Enter your year of birth")
    var day:Int = readLine()!!.toInt()

    var age = year - day

    println("Age $age")


}