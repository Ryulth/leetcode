fun main(args: Array<String>) {
    val instance = LeetCode34()
    val input = intArrayOf(5,7,7,8,8,10)
    val res = instance.searchRange(input, 8)
    println(res[0])
    println(res[1])
}

class LeetCode34 {

    fun searchRange(nums: IntArray, target: Int): IntArray {
        val res = arrayListOf<Int>()
        val length = nums.size

        val index = doSearch(nums, target, 0, length - 1)
        res.add(index)
        for (i in index + 1 until length) {
            if (nums[i] == target && i == length - 1) {
                res.add(i)
                break
            }
            if (nums[i] != target) {
                println(i)
                res.add(i - 1)
                break
            }
        }

        for (i in index - 1 downTo 0) {
            if (nums[i] == target && i == 0) {
                res.add(i)
                break
            }
            if (nums[i] != target) {
                res.add(i + 1)
                break
            }
        }
        res.sort()
        return intArrayOf(res[0], res[res.lastIndex])
    }

    private fun doSearch(nums: IntArray, target: Int, low: Int, high: Int): Int {
        if (low > high) {
            return -1
        }
        val mid = (low + high) / 2

        return when {
            nums[mid] == target -> {
                mid
            }
            nums[mid] > target -> {
                doSearch(nums, target, low, mid - 1)
            }
            else -> {
                doSearch(nums, target, mid + 1, high)
            }
        }
    }
}
