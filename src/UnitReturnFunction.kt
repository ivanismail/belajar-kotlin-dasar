fun printHello():Unit {
    println("Hello")
}

fun sum(a: Int, b: Int): Int{
    var total = a + b
    return  total
}

// Single Expresion Funciton
fun kalidua(a: Int): Int{
    return a * 2
}
// bisa disederhahakan dengan single expresion func
fun kaliduaya(a: Int): Int= a*2

fun hitungTotal (vararg values: Int): Int {
    var total = 0

    for (value in values){
        total += value
    }

    return total;
}

fun main() {
    printHello()

    val result = sum(100, 90)
    println(result)

    val result2 = hitungTotal(10, 20, 30)
    println(result2)
}