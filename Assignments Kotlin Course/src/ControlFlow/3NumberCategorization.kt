package ControlFlow

fun main(args: Array<String>) {
    // Read an integer from the user
    print("Enter an integer: ")
    val input = readLine()?:""
    var number = input.toInt()

    // Check if input is valid
    if (input != "") {
        // Using if-else statements
        if (number > 0) {
            println("Using If-else: The number is positive.")
        } else if (number < 0) {
            println("Using If-else: The number is negative.")
        } else {
            println("Using If-else: The number is zero.")
        }

        // Using when expression
        when {
            number > 0 -> println("Using When: The number is positive.")
            number < 0 -> println("Using When: The number is negative.")
            else -> println("Using When: The number is zero.")
        }
    } else {
        println("Invalid input. Please enter a valid integer.")
    }
}
