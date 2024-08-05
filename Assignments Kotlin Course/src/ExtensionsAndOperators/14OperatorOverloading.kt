package ExtensionsAndOperators

// Class to represent a complex number
data class ComplexNumber(val real: Double, val imaginary: Double) {

    // Overloading the + operator for ComplexNumber addition
    operator fun plus(other: ComplexNumber): ComplexNumber {
        return ComplexNumber(this.real + other.real, this.imaginary + other.imaginary)
    }

    // Method to display the complex number in a + bi format
    override fun toString(): String {
        return "$real + ${imaginary}i"
    }
}

fun main() {
    // Creating instances of ComplexNumber
    val c1 = ComplexNumber(1.0, 2.0)
    val c2 = ComplexNumber(3.0, 4.0)

    // Adding two complex numbers using the overloaded + operator
    val result = c1 + c2

    println("Result of $c1 + $c2 = $result") // Output: Result of 1.0 + 2.0i + 3.0 + 4.0i = 4.0 + 6.0i
}
