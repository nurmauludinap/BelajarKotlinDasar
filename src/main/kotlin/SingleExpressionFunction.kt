fun main() {

    // Memanggil Single Expression Function
    println(double(50))
    hi("Bambang")
}

fun double(a: Int): Int = a * 2
fun hi(name: String): Unit = println("Hello $name")