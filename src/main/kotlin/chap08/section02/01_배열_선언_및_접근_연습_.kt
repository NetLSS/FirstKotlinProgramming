package chap08.section02

import java.util.Arrays

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5)

    println("arr: ${arr.contentToString()}")
    println("size: ${arr.size}")
    println("sum(): ${arr.sum()}")

    println(arr.get(2))
    println(arr[2])

    arr.set(2, 7)
    arr[0] = 8
    println("size: ${arr.size} arr[0]: ${arr[0]}, arr[2]: ${arr[2]}")

    for (i in arr.indices) {
        println("arr[$i] = ${arr[i]}")
    }

    val array = arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 4),
        intArrayOf(5, 6, 7)
    )
    println(array.contentDeepToString())

    println((arr + 1 + 99).contentToString())

    var sliced = arr.sliceArray(arr.size - 2 until arr.size)
    println(sliced.contentToString())
}
/*
arr: [1, 2, 3, 4, 5]
size: 5
sum(): 15
3
3
size: 5 arr[0]: 8, arr[2]: 7
arr[0] = 8
arr[1] = 2
arr[2] = 7
arr[3] = 4
arr[4] = 5
[[1, 2], [3, 4], [5, 6, 7]]
[8, 2, 7, 4, 5, 1, 99]
[4, 5]

Process finished with exit code 0
 */