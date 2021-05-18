package chap02.section3

fun main() {
    val num = 256

    if (num is Int) {
        print(num)
    } else if (num !is Int) { // Int 형이 아닌 경우 (python 의 is not 과 동일 한듯)
        print("Not a Int")
    }

    // 256
}