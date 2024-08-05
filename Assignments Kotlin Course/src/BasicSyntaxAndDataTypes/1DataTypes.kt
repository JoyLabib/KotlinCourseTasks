package BasicSyntaxAndDataTypes

fun main(args: Array<String>) {
// Declare variables of different data types
    var intVar: Int = 10
    var doubleVar: Double = 3.14
    var stringVar: String = "Hello, Kotlin!"
    var booleanVar: Boolean = true
    
// Print the initial values
    println("Initial values:")
    println("Int: $intVar")
    println("Double: $doubleVar")
    println("String: $stringVar")
    println("Boolean: $booleanVar")

// Change the values
    intVar = 42
    doubleVar = 2.718
    stringVar = "Kotlin is awesome!"
    booleanVar = false

// Print the updated values
    println("\nUpdated values:")
    println("Int: $intVar")
    println("Double: $doubleVar")
    println("String: $stringVar")
    println("Boolean: $booleanVar")
}