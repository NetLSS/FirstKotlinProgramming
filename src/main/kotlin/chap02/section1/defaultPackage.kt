package chap02.section1

import kotlin.math.PI
import kotlin.math.abs

import edu.Person as User // 현재 패키지에도 Person 클래스 있는 경우 as 로 별명 붙여 사용 가능
// 또는 edu.Person 으로 사용하면된다.

fun main() {
    val intro: String = "안녕하세요!"
    val num: Int = 20
    var var1: Int = 30

    println("intro: $intro, num: $num, var1: $var1") // $ 표현식 키워드를 사용하여 변수의 값 출력
    // intro: 안녕하세요!, num: 20, var1: 30

    println(PI)
    println(abs(-12.7))

    // 사용자 클래스 사용

    val user1 = User("Kildong", 30)
    val user2 = Person("A123", "Kildong")
    val user3 = edu.Person("Kildong2", 32)

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)

    println(user3.name)
    println(user3.age)
}
class Person(val id: String, val name: String){

}