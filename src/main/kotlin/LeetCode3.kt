fun main(args: Array<String>) {
    val instance = LeetCode3()
    val s1 = "pwwkew"
    val res = instance.lengthOfLongestSubstring(s1)
    println(res)
}

class LeetCode3 {
    fun lengthOfLongestSubstring(s: String): Int {
        val set = mutableSetOf<Char>()
        val lengthList = mutableListOf<Int>()
        s.forEachIndexed { index, c ->
            set.add(c)
            for (i in index + 1 until s.length) {
                if (set.contains(s[i])) {
                    lengthList.add(set.size)
                    set.clear()
                    break
                } else {
                    set.add(s[i])
                }
            }
        }
        lengthList.add(set.size)
        return lengthList.max() ?: 0
    }
}