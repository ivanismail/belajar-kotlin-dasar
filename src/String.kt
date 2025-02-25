fun main(){
    var name:String = "Ivan"
    var address:String = """
        Jl. Sosial No. 11DD
        Jatiwaringin
    """.trimIndent()
    var address2:String = """
        |Jl. Sosial No. 11DD
        |Jatiwaringin
    """.trimMargin()
    var address3:String = """
        *Jl. Sosial No. 11DD
        *Jatiwaringin
    """.trimMargin(marginPrefix = "*")

    print(name + address3)
    print("Test $name ${address3.length}")
}