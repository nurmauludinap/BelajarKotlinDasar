fun main() {

    fun test(name: String, operation: (String) -> Unit): Unit = operation(name)

    test("") test@ {
        if (it == "") {
            return@test
        }else{
            println("Eko")
        }
    }
}

fun labelBreak() {
    // Label untuk loop dan break
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            println("$i x $j = ${i * j}")
            if (j == 10) {
                break@loopI
            }
        }
    }
}

fun labelContinue() {
    // Label untuk loop dan continue
    loopI@ for (i in 1..10) {
        loopJ@ for (j in 1..10) {
            if (j == 2) { // di j tidak pernah ada angka 2
                continue@loopI
            }
            println("$i x $j = ${i * j}")
        }
    }
}