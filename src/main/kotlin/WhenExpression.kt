fun main() {

    val finalExam = 'B'

    // When Expression
    when (finalExam) {
        'A' -> println("Amazing")
        'B' -> println("Good")
        'C' -> println("Not Bad")
        'D' -> println("Bad")
        'E' -> println("Try Again Next Year")
        else -> println("Ups")
    }

    // When Expression Multiple Option
    when (finalExam) {
        'A', 'B', 'C' -> println("Selamat Anda Lulus")
        else -> println("Maaf, Anda Tidak Lulus")
    }

    // When Expression In
    val passValues = arrayOf('A', 'B', 'C')
    when (finalExam) {
        in passValues -> println("Selamat Anda Lulus")
        !in passValues -> println("Maaf, Anda Tidak Lulus")
    }

    // When Expression Is
    val name = "Eko"
    when (name) {
        is String -> println("name adalah String")
        !is String -> println("name bukan String")
    }

    // When Sebagai Pengganti If Else
    val examValue = 90
    when {
        examValue > 80 -> println("Good Job")
        examValue > 60 -> println("Not Bad")
        else -> println("Try Again Next Year")
    }

    // Dua atau lebih baris kode yang akan dijalankan (menggunakan curly braces)
    val value = 7
    val stringOfValue = when (value) {
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    println(stringOfValue)
}