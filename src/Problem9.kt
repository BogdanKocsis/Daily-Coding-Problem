/*

Given a list of integers, write a function that returns the largest sum of non-adjacent numbers.
Numbers can be 0 or negative.

For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5.
[5, 1, 1, 5] should return 10, since we pick 5 and 5.

Follow-up: Can you do this in O(N) time and constant space?

*/

fun problem9(nums: Array<Int>): Int {
    if (nums.isEmpty()) return 0

    var incl = 0
    var excl = 0

    for (num in nums) {
        val newIncl = excl + num
        excl = maxOf(incl, excl)
        incl = newIncl
    }
    return maxOf(incl, excl)
}

fun main() {
    println(problem9(arrayOf(2, 4, 6, 2, 5))) // ➜ 13 (2 + 6 + 5)
    println(problem9(arrayOf(5, 1, 1, 5)))     // ➜ 10 (5 + 5)
    println(problem9(arrayOf(-1, -2, -3)))     // ➜ 0 (choose nothing)
    println(problem9(arrayOf(0, 0, 0)))        // ➜ 0
}
