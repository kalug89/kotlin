import java.io.FileWriter

fun main(args:Array<String>){
    println("Enter the full name")
    var name:String? = readLine()
    writeToFile(name!!)
}

fun writeToFile(s: String){

    try{
        println("Enter name for file")


        var string:String? = readLine()
        var save = FileWriter(string +".txt")
        save.write(s)
        save.close()
    } catch (e: Exception){
        println(e.message)
    }

}
