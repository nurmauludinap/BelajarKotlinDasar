const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {

    // Variable Mutable
    //var firstName: String = "Eko"
    var lastName = "Khannedy"

    // Variable Immutable
    // val firstName: String = "Eko"
    // val lastName = "Khannedy"

    // Mengubah Variable
    lastName = "Kurniawan Khannedy"

    // Nullable
    var firstName: String? = "Eko"
    firstName = null

    // Error karena firstName bisa null
    // println(firstName.length)
    // Cara mengakses yang benar
    println(firstName?.length)

//    println(firstName)
//    println(lastName)

    println("$APPLICATION : $VERSION")
}