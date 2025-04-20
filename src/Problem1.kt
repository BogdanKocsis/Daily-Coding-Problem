/*

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

*/

fun problem1(nums: Array<Int>, k: Int): Boolean {
    val seen = mutableSetOf<Int>()
    for (num in nums) {
        val difference = k - num
        if (difference in seen) {
            return true
        }
        seen.add(num)
    }
    return false
}


fun main() {
    val array = arrayOf(10, 15, 3, 7)
    val k = 17
    print(problem1(nums = array, k = k))
}