package io

import java.io.File

fun main(args: Array<String>) {

    val ipToCount = mutableMapOf<String, Int>()
    File("ips.txt").forEachLine {
        val previous = ipToCount.getOrDefault(it, 0)
        ipToCount.put(it, previous + 1)
    }

    val (maxIp, maxCount) = ipToCount.entries.maxBy { it.value }!!

    println("Most frequent IP adress is $maxIp, wich accourred $maxCount times.")
}
