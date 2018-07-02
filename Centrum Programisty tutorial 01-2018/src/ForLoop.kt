fun main(args: Array<String>) {

    var age:Int = 1

    for (item in 1..15) {
        println(age++)
        if(item === 3) {
            age = 0
        } else if(item == 5) {
         age = 7
        }
    }
}