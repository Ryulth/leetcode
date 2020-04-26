fun main(args: Array<String>) {
    val instance = LeetCode11()
    val input = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
    val res = instance.maxArea(input)
    println(res)
}

class LeetCode11 {
    fun maxArea(height: IntArray): Int {
        var maxArea = 0
        for (i in height.indices) {
            for (j in i + 1 until height.size) {
                val tempHeight = if (height[i] > height[j]) height[j] else height[i]
                val area = (j - i) * tempHeight
                if (maxArea < area) maxArea = area
            }
        }
        return maxArea
    }
}