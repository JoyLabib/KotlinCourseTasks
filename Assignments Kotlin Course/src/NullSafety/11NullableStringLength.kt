package NullSafety

fun nullableStringLength(input: String?): Int {
    // Use safe call and Elvis operator to return length or 0 if input is null
    return input?.length ?: 0
}

fun main(args: Array<String>) {
    // Test cases
    val str1: String? = "Hello"
    val str2: String? = null

    println("Length of str1: ${nullableStringLength(str1)}") // Output: 5
    println("Length of str2: ${nullableStringLength(str2)}") // Output: 0
}
