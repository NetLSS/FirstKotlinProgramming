package chap03.section04

import java.util.concurrent.locks.ReentrantLock

var sharable = 1 // 보호가 필요한 공유 자원

fun main() {
    val reLock = ReentrantLock()

    // 아래 3개는 동일 코드
    lock(reLock, { criticalFunc() })
    lock(reLock) { criticalFunc() }
    lock(reLock, ::criticalFunc)

    println(sharable) // 4
}

fun criticalFunc() {
    // 공유 자원을 접근하는 코드 사용
    sharable += 1
}

// 동기화를 위한 코드
fun <T> lock(reLock: ReentrantLock, body: () -> T): T {
    reLock.lock()
    try {
        return body()
    } finally {
        reLock.unlock()
    }
}