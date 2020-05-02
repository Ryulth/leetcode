fun main(args: Array<String>) {
    val instance = LeetCode15()
    val input = intArrayOf(-1, 0, 1, 2, -1, -4)
    val res = instance.threeSum(input)
    println(res)
}


class LeetCode15 {
    fun threeSum(nums: IntArray): List<List<Int>> {
        nums.sort()
        val res = hashSetOf<List<Int>>()

        nums.forEachIndexed { index, item ->
            var si = index + 1
            var ti = nums.size - 1
            while (si < ti) {
                val sum = item + nums[si] + nums[ti]
                when {
                    sum == 0 -> {
                        res.add(arrayListOf(item, nums[si], nums[ti]))
                        si++
                        ti--
                    }
                    sum < 0 -> {
                        si++
                    }
                    else -> {
                        ti--
                    }
                }
            }
        }

        return res.toList()
    }
}