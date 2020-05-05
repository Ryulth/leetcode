fun main(args: Array<String>) {
    val instance = LeetCode49()
    val input = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    val res = instance.groupAnagrams(input)
    println(res)
}

class LeetCode49 {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val res = hashMapOf<String, MutableList<String>>()
        strs.forEach {
            val key = String(it.toCharArray().sortedArray())
            res[key]?.let { list ->
                list.add(it)
            } ?: run {
                res[key] = mutableListOf(it)
            }
        }
        return res.values.toList()
    }
}