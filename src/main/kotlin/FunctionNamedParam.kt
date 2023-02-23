fun main() {

    // Memanggil function dengan Named Argument
    fullName(
        firstName = "Eko",
        lastName = "Khannedy",
        middleName = "Kurniawan"
    )
}

fun fullName(firstName: String,
             middleName: String,
             lastName: String) {
    println("Hello $firstName $middleName $lastName")
}