package ClassesAndObjects

// Base class Vehicle
open class Vehicle() {
    open var make: String = ""
    open var model: String  = ""

    // Open method to display vehicle information (can be overridden)
    open fun displayInfo() {
        println("Make: $make, Model: $model")
    }
}

// Derived class Car
class Car() : Vehicle() {
    override var make: String = ""
    override var model: String  = ""
    var doors: Int = 4

    // Overriding the displayInfo method
    override fun displayInfo() {
        println("Car - Make: $make, Model: $model, Doors: $doors")
    }
}

// Derived class Motorcycle
class Motorcycle(): Vehicle() {
    var hasSidecar: Boolean = false

    // Overriding the displayInfo method
    override fun displayInfo() {
        println("Motorcycle - Make: $make, Model: $model, Sidecar: ${if (hasSidecar) "Yes" else "No"}")
    }
}

fun main() {
    // Creating instances of Car and Motorcycle
    val car = Car()
    car.make = "Toyota"
    car.model = "Corolla"
    car.doors = 4
    val motorcycle = Motorcycle()

    motorcycle.make = "Harley-Davidson"
    motorcycle.model = "Sportster"
    motorcycle.hasSidecar = false

    // Calling the displayInfo method on each instance
    car.displayInfo()
    motorcycle.displayInfo()
}
