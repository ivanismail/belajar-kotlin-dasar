fun main() {
    var x = 0;
    while (true){
        println("Break Me $x")
        x++
        if (x > 100){
            break
        }
    }

    for (i in 1..1000){
        if (i % 2 == 0 ){
            continue
        }
        println("Angka $i")
    }
}