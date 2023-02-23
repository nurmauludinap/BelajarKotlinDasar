fun main() {

    // Memanggil function dengan parameter
    sayHello("Eko", "Khannedy")
    sayHello("Budi", null)
}

//fun sayHello(firstName: String, lastName: String) {
//    println("Hello $firstName $lastName")
//}

// Function dengan parameter boleh null
fun sayHello(firstName: String, lastName: String?) {
    if (lastName == null) {
        println("Hello $firstName")
    }else {
        println("Hello $firstName $lastName")
    }
}
