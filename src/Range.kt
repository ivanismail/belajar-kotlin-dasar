fun main() {
    //    val range = 0..100
    val range = 100 downTo 1 step 5

    println(range.count())
    println(range.contains(50))
    println(range.contains(999))
    println(range.first)
    println(range.last)
    println(range.step)
}