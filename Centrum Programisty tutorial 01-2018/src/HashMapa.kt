fun main(args: Array<String>){
    var map = HashMap<Int, String>()
    map.put(0, "Dog")
    map.put(1, "Cat")
    map.put(2, "Elephant")
    map.put(4, "Giraphe")

    map.put(55, "Crocodil")

    println(map.get(55))

    for(ilement in map.keys) {
        println(map.get(ilement))
    }

    map.put(0, "Lion")
    println(map.get(0))
}