/*

Given an array of integers, find the first missing positive integer in linear time and constant space.
In other words, find the lowest positive integer that does not exist in the array.
The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.

 */

fun problem4(nums: Array<Int>): Int {
    val n = nums.size

    for (i in 0 until n) {
        while (nums[i] in 1..n && nums[nums[i] - 1] != nums[i]) {
            val correctIndex = nums[i] - 1
            nums[i] = nums[correctIndex].also { nums[correctIndex] = nums[i] }
        }
    }

    for (i in 0 until n) {
        if (nums[i] != i + 1) {
            return i + 1
        }
    }
    return n + 1
}

fun main() {
    println(problem4(arrayOf(3, 4, -1, 1)))
    println(problem4(arrayOf(1, 2, 0)))
    println(problem4(arrayOf(7, 8, 9, 11)))
}
