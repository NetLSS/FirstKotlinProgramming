package chap08.section03

fun main() {
    var s = StringBuilder("Hello")
    s[2] = 'x' // 요소 변경 가능

    s.append("World") // 문자열 추가
    s.insert(10, "Added") // 인덱스 10번 부터 추가
    s.delete(5,10 ) // index [5]~[10-1] 까지 삭제
}