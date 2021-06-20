// 당연한 기초 문법이지만 그래도 해버리기

fun main(args: Array<String>) {
    print("Enter the score: ")
    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    if (score >= 90.0){
        grade = 'A'
    } else if (80.0 <= score && score <= 89.9){
        grade = 'B'
    } else if (70.0 <= score && score <= 79.9){
        grade = 'C'
    }

    println("Score: $score, Grade: $grade")
}