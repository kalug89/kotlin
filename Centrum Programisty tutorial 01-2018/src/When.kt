fun main(args: Array<String>) {
    println("Give a number")
    var point:Int = readLine()!!.toInt()

    when(point) {

        1 -> {
            print("One")
        }
        2 -> {
            print("Two")
        }
        3 -> {
            print("Three")
        }
        in 4..30 -> {
            print("From four to Thirty")
        }

        !in 31..35 -> {

        }

        else -> {
            print("Else")
    }
    }
}