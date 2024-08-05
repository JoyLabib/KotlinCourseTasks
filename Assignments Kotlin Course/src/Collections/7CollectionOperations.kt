fun main(args: Array<String>) {
    // List of strings
    val fruits = listOf("apple", "banana", "kiwi", "pear", "plum", "pineapple", "apricot")

    // Filtering: Only include strings with more than 3 characters
    val filteredList = fruits.filter { it.length > 4 }
    println("Filtered List (more than 3 characters): $filteredList")

    // Mapping: Convert each string to its uppercase equivalent
    val mappedList = fruits.map { it.uppercase() }
    println("Mapped List (to uppercase): $mappedList")

    // Reducing: Concatenate all strings
    val reducedString = fruits.reduce { acc, s -> "$acc, $s" }
    println("Reduced String (concatenation): $reducedString")

    // Set of integers
    val intSet = setOf(1, 2, 3, 4, 5, 2, 3)
    println("Set of integers (no duplicates): $intSet")

    // Filtering: Only include only odd numbers
    val filteredInts = intSet.filter { it % 2 != 0}
    println("Fargs: Array<String>iltered List (more than 3 characters): $ filteredInts ")

    // Mapping: Convert each integer to its double equivalent
    val MappedInts = intSet.map { it*2 }
    println("Mapped List (to uppercase): $ MappedInts ")

    /// Reducing: Concatenate all integers into a string
    val reduced = intSet.map { it.toString() }.reduce { acc, s -> "$acc, $s" }
    println("Reduced String (concatenation): $reducedString")

    // Map of fruits and their colors
    val fruitColorMap = mapOf(Pair("apple", "red"), Pair("banana", "yellow"), Pair("kiwi", "green"))

    val filteredMap = fruitColorMap.filter { (_, color) -> color.startsWith("r") }
    println(filteredMap)

    val mappedMap = fruitColorMap.mapValues { (_, color) -> color.uppercase() }
    println(mappedMap)  // Output: {apple=RED, banana=YELLOW, kiwi=GREEN}

    val concatenatedColors = fruitColorMap.values.reduce { acc, color -> acc + ", " + color }
    println(concatenatedColors)

}
