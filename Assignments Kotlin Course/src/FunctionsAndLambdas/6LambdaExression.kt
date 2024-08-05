package FunctionsAndLambdas

fun main(args: Array<String>) {
    // List of integers
    val numbers = listOf(1, 2, 3, 4, 5, 6)

    // Lambda expression to filter even numbers
    val evenNumbers = numbers.filter { it % 2 == 0 }

    println("Original numbers: $numbers")
    println("Even numbers: $evenNumbers")
}
