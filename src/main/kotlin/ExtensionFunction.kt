fun main() {

    // Memanggil Extension Function
    val name: String = "Eko"
    println(name.hello())

    name.printHello()

    "Kurniawan".printHello()
}

fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")
