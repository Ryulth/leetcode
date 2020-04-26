fun main(args: Array<String>) {
    val instance = LeetCode6()
    val s = "AB"
    val numRows = 1
    val res = instance.convert(s, numRows)
    println(res)
}

class LeetCode6 {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) return s
        val array = Array(numRows) { "" }
        var level = 0;
        var isDecreasing = true
        s.forEach { c ->
            array[level] = array[level] + c
            if (isDecreasing) level += 1
            else level -= 1

            if (level == numRows-1) isDecreasing = false
            if (level == 0) isDecreasing = true
        }
        val builder = StringBuilder()
        array.forEach {
            builder.append(it)
        }
        return builder.toString()
    }
}