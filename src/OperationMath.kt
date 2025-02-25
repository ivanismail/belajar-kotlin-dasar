fun main() {
    val result = 10.0/3.0
//    print(result)

    var total:Int=0
    val barang1 = 100
    val barang2 = 200

    total = barang1 + barang2
    // bisa di persingkat
    total = total + barang1
    total = total + barang2
    // dengan
    total += barang1
    total += barang2

    println(total)
}