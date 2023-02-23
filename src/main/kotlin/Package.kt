import com.company.belajar.util.sayHello
// import com.company.belajar.util.* (memanggil semua function di util)

fun main() {

    // Memanggil function dengan import
    sayHello("Bambang")

    // Memanggil function tanpa import (langsung)
    com.company.belajar.util.sayGoodbye("Eko")
}