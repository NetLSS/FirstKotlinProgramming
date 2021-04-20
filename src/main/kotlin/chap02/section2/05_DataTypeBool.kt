package chap02.section2

fun main() {
    val isOpen = true
    val isUploaded: Boolean // 변수 초기화 없이 선언만 하는 경우 자료형 명시 필수

    isUploaded = !isOpen

    println("isOpen: $isOpen, isUploaded: $isUploaded")
    // isOpen: true, isUploaded: false
}