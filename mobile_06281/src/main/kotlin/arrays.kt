fun main(args: Array<String>) {
    val hewan = arrayOf("kancil", "kelinci", "kijang", "singa", "macan")
    hewan[4] = "honda"

    if ("kancil" in hewan) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }
    for (x in hewan) {
        println(x)
    }
    println(hewan[2])
    println(hewan.size)
}