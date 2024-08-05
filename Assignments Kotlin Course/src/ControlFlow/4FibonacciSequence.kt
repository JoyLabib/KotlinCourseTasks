package ControlFlow

fun main(args: Array<String>) {
    // Initialize the first two Fibonacci numbers
    var first = 0
    var second = 1

    // Print the first 10 Fibonacci numbers
    println("The first 10 numbers of the Fibonacci sequence are:")
    for (i in 1..10) {
        print("$first ")

        // Calculate the next Fibonacci number
        val next = first + second
        first = second
        second = next
    }
    println()
}
