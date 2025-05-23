# Daily Coding Problem

Solutions to [Daily Coding Problem](https://www.dailycodingproblem.com) in Kotlin.

## Problem 1

This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

[Solution](https://github.com/BogdanKocsis/Daily-Coding-Problem/blob/master/src/Problem1.kt)

---
## Problem 2

This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].


[Solution](https://github.com/BogdanKocsis/Daily-Coding-Problem/blob/master/src/Problem2.kt)

---

## Problem 3

This problem was asked by Google.

Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree.

For example, given the following Node class

```kotlin
data class TreeNode(
    val value: String,
    val left: TreeNode? = null,
    val right: TreeNode? = null
)
```

The following test should pass:

```kotlin
val node = TreeNode(
    "root",
    TreeNode("left", TreeNode("left.left"), TreeNode("right"))
)

val serialized = serialize(node)
val deserialized = deserialize(serialized)

check(deserialized.left?.left?.value == "left.left") { "Test failed!" }
```

[Solution](https://github.com/BogdanKocsis/Daily-Coding-Problem/blob/master/src/Problem3.kt)

---

## Problem 4

This problem was asked by Stripe.

Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.

[Solution](https://github.com/BogdanKocsis/Daily-Coding-Problem/blob/master/src/Problem4.kt)

---

## Problem 5

This problem was asked by Jane Street.

cons(a, b) constructs a pair, and car(pair) and cdr(pair) returns the first and last element of that pair. For example, car(cons(3, 4)) returns 3, and cdr(cons(3, 4)) returns 4.

Given this implementation of cons:

```kotlin
fun <A, B> cons(a: A, b: B): ((A, B) -> Any) -> Any {
    return { cb -> cb(a, b) }
}
```

Implement car and cdr.

[Solution](https://github.com/BogdanKocsis/Daily-Coding-Problem/blob/master/src/Problem5.kt)

---

## Problem 6

This problem was asked by Google.

An XOR linked list is a more memory efficient doubly linked list. Instead of each node holding next and prev fields, it holds a field named both, which is an XOR of the next node and the previous node. Implement an XOR linked list; it has an add(element) which adds the element to the end, and a get(index) which returns the node at index.

If using a language that has no pointers (such as Javascript), you can assume you have access to getPointer and dereferencePointer functions that converts between nodes and memory addresses.

[Solution](https://github.com/BogdanKocsis/Daily-Coding-Problem/blob/master/src/Problem6.kt)

---

## Problem 7

This problem was asked by Facebook.

Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

You can assume that the messages are decodable. For example, '001' is not allowed.

[Solution](https://github.com/BogdanKocsis/Daily-Coding-Problem/blob/master/src/Problem7.kt)

---

## Problem 8

This problem was asked by Google.

A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.

Given the root to a binary tree, count the number of unival subtrees.

For example, the following tree has 5 unival subtrees:

```
   0
  / \
 1   0
    / \
   1   0
  / \
 1   1
```

[Solution](https://github.com/BogdanKocsis/Daily-Coding-Problem/blob/master/src/Problem8.kt)

---

## Problem 9

This problem was asked by Airbnb.

Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.

For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.

Follow-up: Can you do this in O(N) time and constant space?

[Solution](https://github.com/BogdanKocsis/Daily-Coding-Problem/blob/master/src/Problem9.kt)

---

## Problem 10

This problem was asked by Apple.

Implement a job scheduler which takes in a function f and an integer n, and calls f after n milliseconds.

[Solution](https://github.com/BogdanKocsis/Daily-Coding-Problem/blob/master/src/Problem10.kt)

---

## Problem 11

This problem was asked by Twitter.

Implement an autocomplete system. That is, given a query string s and a set of all possible query strings, return all strings in the set that have s as a prefix.

For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].


[Solution](https://github.com/BogdanKocsis/Daily-Coding-Problem/blob/master/src/Problem11.kt)

---

## Problem 12

This problem was asked by Amazon.

There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time. Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.

For example, if N is 4, then there are 5 unique ways:

- 1, 1, 1, 1
- 2, 1, 1
- 1, 2, 1
- 1, 1, 2
- 2, 2


[Solution](https://github.com/BogdanKocsis/Daily-Coding-Problem/blob/master/src/Problem12.kt)

---

## Problem 13

This problem was asked by Amazon.

Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.

For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb".

[Solution](https://github.com/BogdanKocsis/Daily-Coding-Problem/blob/master/src/Problem13.kt)

---
