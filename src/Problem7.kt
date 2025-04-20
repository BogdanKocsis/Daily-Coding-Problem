/*

Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decodable. For example, '001' is not allowed.

*/

fun problem7(string: String): Int {
    if (string.isEmpty() || string[0] == '0') return 0

    val length = string.length
    val holder = IntArray(length + 1)
    holder[0] = 1
    holder[1] = 1

    for (i in 2..length) {
        val oneDigit = string.substring(i - 1, i).toInt()
        val twoDigits = string.substring(i - 2, i).toInt()

        if (oneDigit in 1..9) holder[i] += holder[i - 1]
        if (twoDigits in 10..26) holder[i] += holder[i - 2]
    }

    return holder[length]
}

fun main() {
    println(problem7("111")) // ➜ 3: "aaa", "ka", "ak"
    println(problem7("12"))  // ➜ 2: "ab", "l"
    println(problem7("226")) // ➜ 3: "bbf", "bz", "vf"
}
