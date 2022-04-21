fun main(args: Array<String>) {
    val month = 12

    val result = when (month) {
        1 -> "Januari"
        2 -> "Februari"
        3 -> "Maret"
        4 -> "April"
        5 -> "Mei"
        6 -> "Juni"
        7 -> "July"
        8 -> "Agustus"
        9 -> "september"
        10 -> "oktober"
        11 -> "november"
        12 -> "desember"

        else -> "Invalid month."
    }
    println(result)

}