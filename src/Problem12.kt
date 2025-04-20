/*

There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.

For example, if N is 4, then there are 5 unique ways:

1, 1, 1, 1
2, 1, 1
1, 2, 1
1, 1, 2
2, 2

*/

fun problem12(n: Int): Int{
    var a = 1
    var b = 1

    for(i in 2..n){
        val temp = a + b
        a = b
        b = temp
    }
    return b
}

fun main() {
    println(problem12(4)) // ➜ 5
    println(problem12(5)) // ➜ 8
    println(problem12(1)) // ➜ 1
}
