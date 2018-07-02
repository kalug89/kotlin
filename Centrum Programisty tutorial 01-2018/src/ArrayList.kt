fun main(args: Array<String>) {
    var arrayListAnimals:ArrayList<String> = ArrayList<String>()
    arrayListAnimals.add("Dog")
    arrayListAnimals.add("Cat")
    arrayListAnimals.add("Lion")
    arrayListAnimals.add("Pathera")
    arrayListAnimals.add("Geparth")
    arrayListAnimals.add("Elephant")

    for(item in arrayListAnimals) {
        println(item)
    }
    arrayListAnimals.set(1, "Cat in shoes")
    for(item in arrayListAnimals){
        println(item)
    }

    if(arrayListAnimals.contains("Dog")) {
        println("Dog founded")
    } else {
        println("Here is not Animal dog")
    }

    for (index in 0..arrayListAnimals.size - 1){
        println(arrayListAnimals.get(index))
    }
}