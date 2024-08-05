package ExtensionsAndOperators

// Extension function to count vowels in a String
fun String.countVowels(): Int {
    val vowels = "aeiouAEIOU"
    return this.count { it in vowels }
}

fun main(args: Array<String>) {
    // Example usage of countVowels extension function
    val word = "hello"
    println("Number of vowels in \"$word\": ${word.countVowels()}") // Output: 2

    val anotherWord = "Kotlin"
    println("Number of vowels in \"$anotherWord\": ${anotherWord.countVowels()}") // Output: 2
}

