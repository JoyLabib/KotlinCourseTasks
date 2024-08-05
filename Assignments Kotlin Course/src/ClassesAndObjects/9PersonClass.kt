package ClassesAndObjects

class Person(val name: String, var age: Int) {

    // Method to display the details of the person
    fun displayDetails() {
        println("Name: $name, Age: $age")
    }
}

fun main(args: Array<String>) {
    // Creating instances of the Person class
    val person1 = Person("Alice", 30)
    val person2 = Person("Bob", 25)

    // Calling the displayDetails method on each instance
    person1.displayDetails()
    person2.displayDetails()
}
