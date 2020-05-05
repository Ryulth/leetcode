fun main(args: Array<String>) {
    val instance = LeetCode36()
    val input = intArrayOf(2, 3, 6, 7)
    val res = instance.combinationSum(input, 7)
    println(res)
}

class LeetCode36 {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val res = mutableSetOf<List<Int>>()
        sum(candidates, target, mutableListOf(), res)
        return res.toList()
    }

    private fun sum(candidates: IntArray, target: Int, tempList: MutableList<Int>, result: MutableSet<List<Int>>) {
        if (tempList.sum() == target) {
            tempList.sort()
            result.add(tempList)
            return
        } else if (tempList.sum() > target) {
            return
        }

        for (i in candidates) {
            val temp = mutableListOf<Int>()
            temp.addAll(tempList)
            temp.add(i)
            sum(candidates, target, temp, result)
        }
    }
}
