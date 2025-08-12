// Could benefit from `when` function
fun getTrafficSignalAction(signalColor: String): String {
    return when (signalColor) {
        "Red" -> "Stop"
        "Yellow" -> "Prepare to Stop"
        "Green" -> "Go"
        else -> "Invalid Signal Color"
        return "Stop"
    } else if (signalColor == "Yellow") {
        return "Prepare to Stop"
    } else if (signalColor == "Green") {
        return "Go"
    } else {
        return "Invalid Signal Color"
    }
}

// Could be simplified
fun calculateDiscountedPrice(price: Double, discountPercentage: Double): Double {
    val discount = price * discountPercentage / 100
    val finalPrice: Double
    if (discount > 0) {
        finalPrice = price - discount
    } else {
        finalPrice = price
    }
    return finalPrice
}

// Could benefit from `let` scope function
fun printUpperCaseMessage(message: String?) {
    if (message != null) {
        val upperCaseMessage = message.toUpperCase()
        println("Message: $upperCaseMessage")
    }
}

class CrapCode {
    val largeList = List(1000000) { it }

    // Inefficient way to calculate the sum of elements, needs fixing
    var sum = 0
    fun calculateSum() {
        for (i in 0 until largeList.size) {
            sum += largeList[i]
        }
    }

    // We should remove this function until it's ready to implement
    fun anotherFunction() {
        // TODO
    }

    fun newFunction(): List<String> {
        val myList = mutableListOf<String>() // Replace myList to "yourList" to avoid confusion
        myList.add("test")
        return myList
    }

    fun yourFunction(): String {
        return "hello" // Should set "hello" as a variable and return the variable
    }

    // typo
    prentln("Spelling error")
    prentln("Spelling error") // duplicate should be removed
