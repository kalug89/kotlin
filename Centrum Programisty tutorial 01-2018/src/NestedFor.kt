fun main(args: Array<String>) {

    for(item in 1..2) {
        println("item")
        for(item2 in 1..5){
            println("Item2: $item2")
        }
    }
    println("Loop Done")
}