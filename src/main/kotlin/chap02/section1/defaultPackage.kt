package chap02.section1

import kotlin.math.PI
import kotlin.math.abs

import edu.Person as User // 현재 패키지에도 Person 클래스 있는 경우 as 로 별명 붙여 사용 가능

fun main() {
    val intro: String = "안녕하세요!"
    val num: Int = 20
    var var1: Int = 30

    println("intro: $intro, num: $num, var1: $var1")
    // intro: 안녕하세요!, num: 20, var1: 30

    println(PI)
    println(abs(-12.7))

    // 사용자 클래스 사용

    val user1 = User("Kildong", 30)
    val user2 = Person("A123", "Kildong")

    println(user1.name)
    println(user1.age)

    println(user2.id)
    println(user2.name)
}
class Person(val id: String, val name: String){

}