package chap08.section02

fun main() {
    val numbers = arrayOf(1, 2, 3)
    val strs = arrayOf("One", "Two", "Three")
    val simpleArray = arrayOf(numbers, strs)
    simpleArray.forEach { println(it) }

    val flattenSimpleArray = simpleArray.flatten()
    println(flattenSimpleArray)
}
/*
[Ljava.lang.Integer;@5e2de80c
[Ljava.lang.String;@1d44bcfa
[1, 2, 3, One, Two, Three]

Process finished with exit code 0

 */