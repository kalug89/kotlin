package conditionals

import java.util.*

fun main(args: Array<String>) {
    val random = Random().nextInt(50)
    when(random) {
        in 1..10 -> println("1-10")
        in 11..20 -> println("11-20")
        in 21..30 -> println("21-30")
        in 31..40 -> println("31--40")
        else -> println("elxe")
    }
}
