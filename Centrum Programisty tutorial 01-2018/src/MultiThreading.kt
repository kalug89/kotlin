class MyThread() : Thread() {
    var nameThread: String = ""

    constructor(nameThread: String) : this() {
        this.nameThread = nameThread
        println("$this.nameThread is started}")
    }

    override fun run() {
        //process
        var count = 0
        while (count <= 10) {
            println("Count: $count")
            count++

            try {
                Thread.sleep(1000)
            } catch (e: Exception) {
                println(e.message)
            }
        }
    }
}

fun main(args: Array<String>) {
    var myThread = MyThread("Thread one")
    myThread.start()
    var myThread2 = MyThread("Thread two")
    myThread2.start()
    var myThread3 = MyThread("Thread three")
    myThread3.start()
}


