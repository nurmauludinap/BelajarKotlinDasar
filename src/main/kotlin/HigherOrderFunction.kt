fun main() {

    // Lambda dibuat variabel terlebih dahulu
    val upperTransformer = { name: String -> name.uppercase() }
    println(hello("eko", upperTransformer))

    // Lambda langsung dimasukkan di dalam hello
    println(hello("BAMBANG", { name: String -> name.lowercase() }))

    // Lambda di luar hello
    val result = hello("KURNIAWAN") { name: String ->
        name.lowercase()
    }
    println(result)
}

fun hello(name: String, transformer: (String) -> String): String {
    val nameTransform = transformer(name)
    return "Hello $nameTransform"
}