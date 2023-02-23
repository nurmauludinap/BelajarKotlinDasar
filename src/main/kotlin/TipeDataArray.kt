fun main() {

    val members: Array<String> = arrayOf("Eko", "Joko", "Budi")
    val values: Array<Byte> = arrayOf(100, 90, 95)
    val balances: Array<Int> = arrayOf(10_000, 20_000, 30_000)

    // Beberapa cara untuk memanggil array sesuai index
    val eko: String = members[0]
    val joko: String = members.get(1)
    val budi: String = members.get(2)

    // Mengganti array index ke-0 menjadi Amar
    members.set(0, "Amar")
    val amar: String = members[0]
    members[0] = "Amar"

    // Mencetak array di index tertentu
//    println(members[0])
//    println(members.get(0))

    // Array Nullable
    val names: Array<String?> = arrayOfNulls(5)
    names.set(0, "Eko")
    names.set(1, null)
    names.set(2, "Kurniawan")
    names.set(3, null)
    names.set(4, "Khannedy")

    println(names[0])
    println(names.get(1))
    println(names.get(2))
    println(names[3])
    println(names.get(4))


//    println(members)
//    println(values)
//    println(balances)
}