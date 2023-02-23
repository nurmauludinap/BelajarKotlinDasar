fun main() {

    // Membuat Lambda Expression
    val contohLambda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }
    val result = contohLambda("Eko", "Kurniawan")
    println(result)

    // Lambda Expression dengan 1 parameter (it)
    val sayHello: (String) -> String = {
        "Hello $it"
    }
    println(sayHello("Eko"))
    println(sayHello("Bambang"))

    // Lambda Expression dengan Method References
    // Lambda-nya
    val lambdaName: (String) -> String = ::toUpper

    // Eksekusi lambda
    val name = lambdaName("eko")
    println(name)
    println(lambdaName("bambang"))
}

fun toUpper(value: String): String = value.uppercase()