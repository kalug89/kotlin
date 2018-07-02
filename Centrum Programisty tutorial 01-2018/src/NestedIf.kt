fun main(args: Array<String>) {
    println("Enter points:")
    val points: Int = readLine()!!.toInt()
    if (points >= 80) {
        if (points >= 90) {
            println("5 +")
        }else{
        print("5 -")
        }
    } else if(points >= 50 && points <= 79) {
        if(points >= 69) {
            print("4+")
        } else{
            print("4 -")
        }
    }
}
