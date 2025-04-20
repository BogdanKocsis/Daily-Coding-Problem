/*

Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.

For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb".

*/

fun problem13(string: String, k: Int): Int {
    if (k == 0 || string.isEmpty()) return 0

    var left = 0
    var maxLen = 0
    val charCount = mutableMapOf<Char, Int>()

    for (right in string.indices) {
        val rightChar = string[right]
        charCount[rightChar] = charCount.getOrDefault(rightChar, 0) + 1

        while (charCount.size > k) {
            val leftChar = string[left]
            charCount[leftChar] = charCount[leftChar]!! - 1
            if (charCount[leftChar] == 0) charCount.remove(leftChar)
            left++
        }
        maxLen = maxOf(maxLen, right - left + 1)
    }
    return maxLen
}

fun main() {
    println(problem13("abcba", 2)) // ➜ 3 ("bcb")
    println(problem13("aaabbcc", 1)) // ➜ 3 ("aaa" or "bb" or "cc")
    println(problem13("a", 1)) // ➜ 1
    println(problem13("eceba", 2)) // ➜ 3 ("ece")
}
