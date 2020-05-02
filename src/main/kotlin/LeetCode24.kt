import java.lang.Exception

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

fun main(args: Array<String>) {
    val instance = LeetCode24()
    val l1 = ListNode(1)
    l1.next = ListNode(2)
    l1.next!!.next = ListNode(3)
    l1.next!!.next!!.next = ListNode(4)
    l1.next!!.next!!.next!!.next = ListNode(5)
    val res = instance.swapPairs(l1)
    println(res)
    var currentNode = res
    while (currentNode != null) {
        println(currentNode.`val`)
        currentNode = currentNode.next
    }
}

class LeetCode24 {
    fun swapPairs(head: ListNode?): ListNode? {
        val temp = ListNode(0)
        temp.next = head
        var cursor = head
        while (cursor?.next != null) {
            val val1 = cursor.`val`
            val val2 = cursor.next!!.`val`
            cursor.`val` = val2
            cursor.next!!.`val` = val1
            cursor = cursor.next!!.next
        }
        return temp.next
    }
}