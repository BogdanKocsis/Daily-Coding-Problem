/*

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].

If our input was [3, 2, 1], the expected output would be [2, 3, 6].

*/

fun problem2(nums: List<Int>): List<Int> {
    val zeroCount = nums.count { it == 0 }

    if (zeroCount > 1) return List(nums.size) { 0 }

    if (zeroCount == 1) {
        val totalProduct = nums.filter { it != 0 }.reduce { acc, num -> acc * num }
        return nums.map { if (it == 0) totalProduct else 0 }
    }

    val totalProducts = nums.reduce { acc, num -> acc * num }
    return nums.map { totalProducts / it }
}

fun main() {
    val input1 = listOf(1, 2, 3, 4, 5)
    println(problem2(input1))

    val input2 = listOf(3, 2, 1)
    println(problem2(input2))

    val input3 = listOf(1, 2, 0, 4)
    println(problem2(input3))

    val input4 = listOf(1, 0, 0, 4)
    println(problem2(input4))
}
