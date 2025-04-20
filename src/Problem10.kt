/*

Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.

*/

import kotlinx.coroutines.*

fun problem10(f: () -> Unit, delayMillis: Long) {
    GlobalScope.launch {
        delay(delayMillis)
        f()
    }
}

fun main() = runBlocking {
    println("Start: ${System.currentTimeMillis()}")

    problem10({
        println("Hello from coroutine! Time: ${System.currentTimeMillis()}")
    }, 2000)

    println("Scheduled")
    delay(3000)
}