fun main(args: Array<String>) {
    val instance = LeetCode()
    val input = "leetcode"
    val res = instance.solve(input)
    println(res)
}

class LeetCode {
    fun solve(input: String): String {
        return input
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}