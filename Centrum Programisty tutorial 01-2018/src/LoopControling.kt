fun main(args: Array<String>) {

    //continue
    //break
    //@loop
    loop@ for (item in 1..5){
        for(item2 in 1..3){
            println("Item2 $item2")
                if (item2 == 2){
                    break@loop
                }
        }
        println("Loop: $item")
    }
}