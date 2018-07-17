package io

fun main(args: Array<String>) {
    println("Enter to world to guess:")
    val word = readLine()
    if (word == null) {
        println("No word given, game ended")
        return
    }

    for (i in 1..100) {
        println()
    }

    //Tree
    //tree
    //{'t', 'r', 'e', 'e']
    //['t','r', 'e'}
    val letter = word.toLowerCase().toCharArray().toHashSet()
    val correcrGuesses = mutableSetOf<Char>()
    var fails = 0

    while (letter != correcrGuesses) {

        printExploredWord(word, correcrGuesses)
        println("\n#Wrond guesses: $fails\n")

        println("Guess letter:")
        val input = readLine()

        if (input == null) {
            continue
        } else if (input.length != 1) {
            println("Please enter on letter")
            continue
        }
        if (word.toLowerCase().contains(input.toLowerCase())) {
            correcrGuesses.add(input[0].toLowerCase())
        } else {
            ++fails
        }
    }
    printExploredWord(word, correcrGuesses)
    println("\n#Wrong guesses: $fails\n\n")
    println("Well done")
}

fun printExploredWord(word: String, correctGuesses: Set<Char>) {
    for (character in word.toLowerCase()) {
        if (correctGuesses.contains(character)) {
            print(character + " ")
        } else {
            print("_ ")
        }
    }
}