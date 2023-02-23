fun main() {

    // Membuat Return If
    fun sayHello(name: String = ""): String {
        return if (name == "") {
            "Hello Bro!"
        }else{
            "Hello $name!"
        }
    }

    // Membuat Return When
    fun sayHi(name: String = ""): String {
        return when (name) {
            "" -> "Hi Bro!"
            else -> "Hi $name!"
        }
    }

    println(sayHello())
    println(sayHello("Eko"))

    println(sayHi())
    println(sayHi("Bambang"))
}