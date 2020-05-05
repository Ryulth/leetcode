import kotlin.concurrent.fixedRateTimer

fun main(args: Array<String>) {
    val instance = LeetCode73()
    val input = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 1), intArrayOf(1, 1, 1))
    val res = instance.setZeroes(input)
    input.forEach {
        it.forEach { item ->
            print(item)
        }
        println()
    }
    println(input)
}

class LeetCode73 {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        val zeroIndex = mutableSetOf<Pair<Int, Int>>()
        matrix.forEachIndexed { index, ints ->
            ints.forEachIndexed { index2, item ->
                if (item == 0) {
                    zeroIndex.add(Pair(index, index2))
                }
            }
        }
        zeroIndex.forEach {
            for (i in matrix[it.first].indices) {
                matrix[it.first][i] = 0
            }
            for (element in matrix) {
                element[it.second] = 0
            }
        }
    }
}