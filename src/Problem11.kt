/*

Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.

For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].

Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.

*/

fun problem11(prefix: String, words: List<String>): List<String> {
    return words.filter { word -> word.startsWith(prefix) }
}

fun main() {
    val words = listOf("dog", "deer", "deal")
    println(problem11("de", words)) // ➜ [deer, deal]
    println(problem11("do", words)) // ➜ [dog]
    println(problem11("a", words))  // ➜ []
}
