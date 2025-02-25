fun main() {
    val finalExam = 'X'
    when (finalExam) {
        'A'-> {
            println("Amazing")
        }
        'B'-> println("Good")
        else -> println("Upps")
    }

    // when pengganti if else
    when {
        finalExam == 'A' -> println("Good")
        else -> println("Upps")
    }
}