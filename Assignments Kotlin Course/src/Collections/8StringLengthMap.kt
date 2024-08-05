package Collections

fun mapStringLengths(strings: List<String>): Map<String, Int> {
    return strings.associateWith { it.length }
}

fun main(args: Array<String>) {
    // List of strings
    val stringList = listOf("apple", "banana", "kiwi")

    // Get the map of string lengths
    val stringLengthMap = mapStringLengths(stringList)

    println("String Length Map: $stringLengthMap")
}
