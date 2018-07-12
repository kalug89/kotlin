package loops

fun main(args: Array<String>) {
    val number = listOf(1, 2, 3, 6, 8, 9)
    println(reverse(number))
    println(reserve2(number))
}

fun reverse(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    for (i in 0..list.size-1){
        result.add(list.get(list.size-1-i))
    }
    return result
}

fun reserve2(list: List<Int>): List<Int>{
    val result = arrayListOf<Int>()
    for (i in list.size -1 downTo 0) {
        result.add(list.get(i))
    }
    return result
}
