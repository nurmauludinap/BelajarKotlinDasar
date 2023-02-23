fun main() {

    // Menampung dan memanggil Function Infix
    val result: String = "Eko" to "UP"
    val result2: String = "BAMBANG" to "DOWN"

    println(result)
    println(result2)

}

infix fun String.to(type: String): String {
    if (type == "UP") {
        return this.uppercase()
    }else{
        return this.lowercase()
    }
}