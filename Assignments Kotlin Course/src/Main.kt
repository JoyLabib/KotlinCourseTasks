fun sumOfEvenNumbers(numbers: List<Int>): Int {
    var sum = 0
    for (number in numbers) {
        if (number % 2 == 0) {
            sum += number
        }
    }
    return sum
}

fun main() {
    // Test the sumOfEvenNumbers function
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val result = sumOfEvenNumbers(numbers)
    println("Sum of even numbers in $numbers is $result")
}
