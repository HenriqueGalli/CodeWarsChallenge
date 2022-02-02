fun main(args: Array<String>) {
    twoOldestAges(listOf(6, 5, 83, 5, 3, 18))

}

fun spinWords(sentence: String): String {
    var fraseFinal: String = ""
    val palavras = sentence.split(" ")
    for (palavra in palavras) {
        if (palavra.length >= 5) {
            if (palavras.size == 1) {
                fraseFinal += palavra.reversed()
            } else {
                fraseFinal += palavra.reversed() + " "
            }
        } else {
            if (palavras.size == 1) {
                fraseFinal += palavra
            } else {
                fraseFinal += palavra + " "
            }

        }
    }
    return fraseFinal.trim()
}

fun twoOldestAges(ages: List<Int>): List<Int> {
    return ages.sorted().takeLast(2)
}