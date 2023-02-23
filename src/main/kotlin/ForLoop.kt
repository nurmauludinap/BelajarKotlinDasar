fun main() {

    // For Loop Array
    val names = arrayOf("Eko", "Kurniawan", "Khannedy")
    var total = 0
    for (name in names) {
        println(name)
        total++
    }
    println("Total Perulangan = $total")

    // For Loop Range
    for (value in 0..100) {
        println(value)
    }

    for (value in 1000 downTo 0 step 5) {
        println(value)
    }

    val ukuranNames = names.size - 1
    for (i in 0..ukuranNames) {
        println("Indeks ke-$i = ${names.get(i)}")
    }

    // Mengakses indeks setiap elemen di Range
    val ranges = 1.rangeTo(10) step 3
    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }
}