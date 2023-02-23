fun main() {

    // Membuat Function Scope (Function di dalam Function)
    fun sayHello(name: String): Unit {
        println("Hello $name")
    }

    sayHello("Eko")
    sayHello("Bambang")
}