import kotlin.math.abs

fun main(args: Array<String>) {
    val instance = LeetCode16()
    val input = intArrayOf(-1, 2, 1, -4)
    val res = instance.threeSumClosest(input, 1)
    println(res)
}


class LeetCode16 {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        nums.sort()
        var result = nums[0] + nums[1] + nums[2]
        nums.forEachIndexed { index, item ->
            var si = index + 1
            var ti = nums.size - 1
            while (si < ti) {
                val sum = item + nums[si] + nums[ti]
                if (abs(sum - target) < abs(result - target)) {
                    result = sum;
                }
                when {
                    sum < target -> {
                        si++
                    }
                    else -> {
                        ti--
                    }
                }
            }
        }
        return result
    }
}