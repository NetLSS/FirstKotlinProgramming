package chap02.section2

fun main(){
    val exp01 = 3.14 // 실수형 명시 안하면 Double 형으로 자동 추론됨
    val exp02 = 3.14F // F 식별자로 Float 추론 가능

    val exp03 = 3.14E-2 // 왼쪽으로 소수점 2칸 이동
    val exp04 = 3.14e2 // 오른쪽으로 소수점 2칸 이동 ('+'는 생략가능, 소문자 e 사용 가능)

    // 부동 소수점 에서 발생하는 오차
    var num: Double = 0.1 // 0.1은 2진수 0.0_0011_0011_0011... (즉 부동 소수점 자료형에 따라 끝에 무한대 부분이 잘려 저장됨)

    for(x in 0..999){ // 1000번 반복 더함
        num += 0.1
    }

    println(num) // 100.09999999999859
}