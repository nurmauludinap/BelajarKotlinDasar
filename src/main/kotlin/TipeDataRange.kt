fun main() {

//    val range = 1..1000
//    val range = 1000 downTo 1
    val range = 1000 downTo 1 step 10

    println(range.count())
    println(range.contains(200))
    println(range.contains(1200))
    println(range.first)
    println(range.last)
    println(range.step)
}