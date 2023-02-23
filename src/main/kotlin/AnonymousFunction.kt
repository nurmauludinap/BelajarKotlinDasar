fun main() {

    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"
    }

    // Membuat Anonymous Function
    val anonymousUpper = fun(value: String): String {
        if (value.isBlank()) {
            return "Ups"
        }else{
            return value.uppercase()
        }
    }

    println(hello("eko", anonymousUpper))
    println(hello("", anonymousUpper))

    // Anonymous Function langsung di pemanggilan hello
    println(hello("BAMBANG", fun(value: String): String {
        return value.lowercase()
    }))
}

