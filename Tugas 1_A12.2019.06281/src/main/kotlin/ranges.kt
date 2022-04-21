fun main(args: Array<String>) {
    val hewan = arrayOf("kancil", "kelinci", "kijang", "singa", "macan")

    if ("badak" in hewan) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }
}