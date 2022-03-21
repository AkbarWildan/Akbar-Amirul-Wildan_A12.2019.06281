fun myFunction(fnama: String, umur: Int) {
    println(fnama + " Berumur " + umur)
}
fun myFunction(a: Int, b: Int) = a * b
fun main() {
    myFunction("Akbar", 21)
    myFunction("Alvin", 20)
    myFunction("Daniel", 20)

    var result = myFunction(3, 5)
    println(result)
}

