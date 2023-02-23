fun main() {

    // Memanggil function dengan parameter default
    sayHello("Eko", "Khannedy")
    sayHello("Budi")
    sayHello("Joko")
}

// Function dengan parameter default
fun sayHello(firstName: String, lastName: String = "") {
    println("Hello $firstName $lastName")
}
