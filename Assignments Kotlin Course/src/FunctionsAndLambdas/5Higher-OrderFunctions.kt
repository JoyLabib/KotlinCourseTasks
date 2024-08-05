package FunctionsAndLambdas

fun applyToStrings(strings: List<String>, func: (String) -> String): List<String> {
    return strings.map(func)
}

fun main(args: Array<String>) {
    // Example function to convert strings to uppercase
    val toUpperCase: (String) -> String = { it.uppercase() }

    // Test the applyToStrings function
    val inputStrings = listOf("pen", "cup", "pencil", "notebook",)
    val result = applyToStrings(inputStrings, toUpperCase)

    println("Original strings: $inputStrings")
    println("Modified strings: $result")
}
