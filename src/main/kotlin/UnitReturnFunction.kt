fun main() {

    // Memanggil Function dengan Unit Return
    printHello("Bambang")
    printHello(null)
}

fun printHello(name: String?): Unit {
    if (name == null) {
        println("Hello Bro")
    }else{
        println("Hello $name")
    }
}