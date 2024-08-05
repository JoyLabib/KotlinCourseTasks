package NullSafety

fun main() {
    // Example of a nullable string
    val nullableString: String? = "Kotlin"

    // Safe call example
    // If nullableString is not null, it prints the length; otherwise, it prints null
    val length: Int? = nullableString?.length
    println("Length using safe call: $length") // Output: 6

    // Example of a null value
    val anotherNullableString: String? = null

    // Elvis operator example
    // If anotherNullableString is null, the Elvis operator returns "Default"
    val message = anotherNullableString ?: "Default"
    println("Message using Elvis operator: $message") // Output: Default

    // Safe call with a method invocation
    // If nullableString is not null, it prints the uppercase version; otherwise, it prints null
    val uppercased = nullableString?.uppercase()
    println("Uppercased using safe call: $uppercased") // Output: KOTLIN

    // Safe call and Elvis operator combined
    // If anotherNullableString is null, it returns "No value provided"
    val anotherMessage = anotherNullableString?.uppercase() ?: "No value provided"
    println("Another message using safe call and Elvis operator: $anotherMessage") // Output: No value provided
}

