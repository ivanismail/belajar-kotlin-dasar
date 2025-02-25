fun main() {
    val aray = arrayOf("Ivan", "Ismail", "Muslim")
    var total = 0
    for (name in aray){
        println(name)
        total++
    }
    println("Total data: $total")

    for (i in 0..100 step 5){
        println(i)
    }
}