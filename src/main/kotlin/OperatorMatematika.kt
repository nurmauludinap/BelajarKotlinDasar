fun main() {

    val result = 10 / 3
    println(result)

    val result2 = 10.0 / 3.0
    println(result2)

    val result3 = 10 + 10 / 2
    println(result3)

    // Augmented Assignments
    var total: Int = 0

    val barang1 = 100
    total += barang1

    val barang2 = 200
    total += barang2

    val barang3 = 300
    total += barang3

    println(total)

    total++ // total = total + 1
    println(total)
    total-- // total = total - 1
    total--
    println(total)

    val suhu = -5
    println(suhu)

    val sehat = true
    println(!sehat)
}