package collections

fun main(args: Array<String>) {
    val namesToAges = mapOf(Pair("Peter", 24), Pair("Roger", 42))
    val namesToAges2 = mapOf(
            "Peter" to 24,
            "Roger" to 42

    )

    println(namesToAges == namesToAges2)

    println(namesToAges.keys)
    println(namesToAges.values)
    println(namesToAges.entries)

    val countryToInhabitians = mutableMapOf(
            "Germany" to 80_000_000,
            "Usa" to 300_000_000
    )
    countryToInhabitians.put("Australia", 23_000_000)
    countryToInhabitians.putIfAbsent("USA", 320_000_000)
    println(countryToInhabitians)

    println(countryToInhabitians.contains("Australia"))
    println(countryToInhabitians.containsKey("France"))
    println(countryToInhabitians.containsValue(20_000_000))

    println(countryToInhabitians.get("Germany"))
    println(countryToInhabitians.getOrDefault("France", 0))

    namesToAges.entries.forEach{
        it
        println("{$it.key} is ${it.value} yearst old")
    }
}