import java.io.FileReader
import java.io.FileWriter

fun main(args:Array<String>){
    println("Enter the full name")
    var name:String? = readLine()
    writeToFile(name!!)

    readToFile()

}

fun readToFile() {
    try {
        var read = FileReader("mike.txt")
        var a:Int?
        do{
            a = read.read()
            print(a.toChar())
        } while (a!=-1)
    }catch (e:Exception){
        println(e.message)
    }
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
