package chap08.section02

fun main() {
    val b = Array<Any>(10) { it + 1 }
    b[0] = "Hello world"
    b[1] = 1.1
    println(b[0])
    println(b[0])
    println(b[0])

    println(b.contentToString())

    val arr = Array(10) { it + 1 }
    val iter: Iterator<Int> = arr.iterator()
    while (iter.hasNext()) {
        val e = iter.next()
        print("$e ")
    }
}

/*
Hello world
Hello world
Hello world
[Hello world, 1.1, 3, 4, 5, 6, 7, 8, 9, 10]
1 2 3 4 5 6 7 8 9 10
Process finished with exit code 0
 */