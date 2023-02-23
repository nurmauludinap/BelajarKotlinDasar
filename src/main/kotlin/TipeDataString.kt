fun main() {

    var firstName: String = "Eko"
    var lastName: String = "Khannedy"
    //var fullName: String = "Eko Kurniawan Khannedy"

    // Menggabungkan String dengan +
    //var fullName: String = firstName + " " + lastName

    // String Template
    var fullName: String = "$firstName $lastName"
    var desc: String = "total $fullName char = ${fullName.length}"

    var address: String = """
        |Street Not Yet Done,
        |Province Subang,
        |Country Indonesia
    """.trimMargin()
    var address2: String = """
        >Street Not Yet Done,
        >Province Subang,
        >Country Indonesia
    """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(fullName)
    println(desc)
    println(address)
    println(address2)
}