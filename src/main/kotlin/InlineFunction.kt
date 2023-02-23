fun main() {

    println(hello { "Eko" })
    println(hello { "Bambang" })

    for(i in 0..10) {
        println(hi({"Eko"}, {"Kurniawan"}))
    }
}

inline fun hello(name: () -> String): String {
    return "Hello ${name()}"
}

inline fun hi(
    firstName: () -> String,
    noinline lastName: () -> String
    ): String {
    return "Hi ${firstName()} ${lastName()}"
}