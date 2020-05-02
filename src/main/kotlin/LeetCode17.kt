fun main(args: Array<String>) {
    val instance = LeetCode17()
    val input = "23"
    val res = instance.letterCombinations(input)
    println(res)
}

class LeetCode17 {
    companion object {
        val phoneAlphabet = hashMapOf(
            "2" to hashSetOf("a", "b", "c"),
            "3" to hashSetOf("d", "e", "f"),
            "4" to hashSetOf("g", "h", "i"),
            "5" to hashSetOf("j", "k", "l"),
            "6" to hashSetOf("m", "n", "o"),
            "7" to hashSetOf("p", "q", "r", "s"),
            "8" to hashSetOf("t", "u", "v"),
            "9" to hashSetOf("w", "x", "y", "z")
        )
    }

    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) {
            return arrayListOf()
        }
        val result = arrayListOf<String>()
        makeString("", digits, result)
        return result.toList()
    }

    private fun makeString(letter: String, nextDigits: String, result: MutableList<String>) {
        if (nextDigits.isEmpty()) {
            result.add(letter)
            return
        }
        phoneAlphabet.getOrDefault(nextDigits.substring(0, 1), hashSetOf("")).forEach { item ->
            makeString(letter.plus(item), nextDigits.substring(1), result)
        }
    }
}