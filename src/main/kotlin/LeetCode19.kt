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
    val instance = LeetCode19()
    val l1 = ListNode(1)
    l1.next = ListNode(2)
    l1.next!!.next = ListNode(3)
    l1.next!!.next!!.next = ListNode(4)
    l1.next!!.next!!.next!!.next = ListNode(5)
    val res = instance.removeNthFromEnd(l1, 2)
    println(res)
    var currentNode = res
    while (currentNode != null) {
        println(currentNode.`val`)
        currentNode = currentNode.next
    }
}

class LeetCode19 {
    fun removeNthFromEnd(head: ListNode, n: Int): ListNode? {
        val temp = ListNode(0)
        temp.next = head
        var cursor = temp
        var followCursor = temp
        for (i in 0 until n) {
            cursor = cursor.next!!
        }
        while (cursor.next != null) {
            cursor = cursor.next!!
            followCursor = followCursor.next!!
        }
        followCursor.next = followCursor.next!!.next
        return temp.next
    }
}