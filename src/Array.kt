fun main(){
    val member:Array<String> = arrayOf("Ivan", "Ismail", "Muslim")
    val values:Array<Byte> = arrayOf(100 ,90, 95)
    val ballances:Array<Int> = arrayOf(1_000, 20_000, 30_000)

    member.set(0, "Vande")
    val ivan:String = member[0]
    val ismail:String = member.get(1)

    println(ivan)
}