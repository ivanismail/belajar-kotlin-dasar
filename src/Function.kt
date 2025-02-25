fun helloWorld(){
    println("Belajar Kotlin")
}

fun sayHello(firtsName: String, lastName: String?){
    println("Hello $firtsName $lastName")
}

fun sayHelloDefaultParam(firtsName: String, lastName: String=""){
    println("Hello $firtsName $lastName")
}


fun main() {
    helloWorld()
    sayHello("Ivan", null)
    sayHelloDefaultParam("Ivan")
    sayHelloDefaultParam(firtsName = "Rafael", lastName = "Sturick")
}