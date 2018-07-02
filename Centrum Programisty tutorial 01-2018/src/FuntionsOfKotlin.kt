fun main(args: Array<String>) {

    val map = hashMapOf(1 to "Dog", 2 to "Cat", 3 to "Crodolie")
    var array = arrayOf(1,2,3,4,5,11)
    var list = listOf(11,33,44,55,66)
//    for(item in list){
//        println(item)
//    }

    var listMutable = mutableListOf(11, 33, 44, 55)
    println(listMutable[0])
    listMutable[0] = 422

    for (item in listMutable) {
        println(item)
    }
}