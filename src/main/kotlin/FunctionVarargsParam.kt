fun main() {

    // Memanggil Function dengan Variabel Argument (vararg)
    val result = hitungTotal("Eko", 10, 20, 30)
    println(result)

    println(hitungTotal(null, 50, 30, 10))

}

fun hitungTotal(name: String?, vararg values: Int): Int {
    var total = 0

    for (value in values) {
        total += value
    }

    return total
}