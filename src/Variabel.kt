// bisa di akses global
const val APP ="Belajar Kotlin"
const val URL="http://belajar.ord"

fun main(){
    // val tidak bisa diubah, var bisa diubah
    val name: String = "Ivan"
    var nameVar: String = "Ivan"


    var nameNullabe: String? = "Ivan"
    nameNullabe = null


    println(nameNullabe?.length)
    nameVar="shhsjs"
}