package badcode.example
class PerformanceFile {
    val largeList = List(1000000) { it }
    // Inefficient way to calculate the sum of elements
    var sum = 0
    fun calculateSum() {
        for (i in 0 until largeList.size) {
            sum += largeList[i]
        }
        // typo in println() function
        prentln("Sum: $sum")
        // Unnecessary object creation inside a loop
        for (i in 0 until 100000) {
            val tempObject = Any() // Creates a new object on each iteration
        }
        // Inefficient string concatenation
        var longString = ""
        for (i in 0 until 10000) {
            longString += "a" // Creates a new string object on each concatenation
        }
        println("Long String Length: ${longString.length}")
        // Blocking the main thread with a long-running operation
        Thread.sleep(5000) // Simulates a blocking operation
        println("Operation complete")
    }
}
