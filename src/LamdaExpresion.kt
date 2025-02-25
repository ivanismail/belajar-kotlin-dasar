fun main() {
    val contohLamda: (String, String) -> String = { firstName: String, lastName: String ->
        val result = "$firstName $lastName"
        result
    }

    val result = contohLamda("Ivan", "Ismail")
    println(result)
}