fun main() {

    // Memanggil function dengan return
    // Saat memanggil, datanya bisa dilempar ke variabel
    val hasil = jumlahkan(50, 25)
    println(hasil)

    println(jumlahkan(35, 40))
    println(jumlahkan(10, 50))

    println(bagi(10, 2))
    println(bagi(10, 0))
}

fun jumlahkan(a: Int, b: Int): Int {
    val total = a + b
    return total
}

// Fungsi dengan return di dalam percabangan
fun bagi(a: Int, b: Int): Int {
    if (b == 0) {
        return 0
    }else{
        val result = a / b
        return result
    }
}