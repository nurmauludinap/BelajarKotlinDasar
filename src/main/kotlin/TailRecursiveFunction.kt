fun main() {

    // Membuat Tail Recursive Function
    tailrec fun display(value: Int) {
        println("Recursive $value")
        if (value > 0) {
            display(value - 1) // Hanya memanggil dirinya sendiri
        }
    }
    display(1000)

    // Tail Recursive Factorial Function
    tailrec fun factorialTail(value: Int, total: Int = 1): Int {
        return when (value) {
            1 -> total
            else -> factorialTail(value - 1, total * value)
        }
    }
    println(factorialTail(10))
}