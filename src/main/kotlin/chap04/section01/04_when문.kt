package chap04.section01

fun main() {
    print("Enter the score: ")

    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when (score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..90.0 -> grade = 'B' // 89.9 로 하면 89.99 는 처리가 안됨. 위에서 어차피 한번 걸르니까 이렇게 짬
        in 70.0..80.0 -> grade = 'C'
        !in 70.0..100.0 -> grade = 'F'
    }

    println("Score: $score, Grade: $grade")
}

/*
Score: 79.9999, Grade: C

Process finished with exit code 0
 */