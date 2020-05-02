/**
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
*/
fun main(args: Array<String>) {
    val l1 = ListNode(2)
    l1.next = ListNode(4)
    l1.next!!.next = ListNode(3)

    val l2 = ListNode(5)
    l2.next = ListNode(6)
    l2.next!!.next = ListNode(4)
    val instance = LeetCode2()
    val res = instance.addTwoNumbers(l1, l2)
    println(res)
    var currentNode = res
    while (currentNode != null) {
        println(currentNode.`val`)
        currentNode = currentNode.next
    }
}

class LeetCode2 {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val result: ListNode = ListNode(-1)
        var currentL1 = l1
        var currentL2 = l2
        var currentResult = result
        var carryNum = 0
        while (currentL1 != null || currentL2 != null) {
            val num1 = currentL1?.`val` ?: 0
            val num2 = currentL2?.`val` ?: 0
            val sum = num1 + num2 + carryNum

            carryNum = sum / 10

            currentResult.next = ListNode(sum%10)
            currentResult = currentResult.next!!
            currentL1 = currentL1?.next
            currentL2 = currentL2?.next
        }

        if (carryNum > 0) {
            currentResult.next = ListNode(1)
        }
        return result.next
    }
}