package chap08.section02

import java.util.*

fun main() {

    val arr = arrayOf(8, 4, 3, 2, 5, 9, 1)

    // 오름차 내림차 정렬
    val sortedNums = arr.sortedArray()
    println("ASC: ${sortedNums.contentToString()}")

    val sortedNumsDesc = arr.sortedArrayDescending()
    println("DSC: ${sortedNumsDesc.contentToString()}")

    // 원본 배열에 대해 정렬
    arr.sort(1, 3) // 1 부터 3-1 인덱스 까지 정렬
    println("ORI: ${arr.contentToString()}")

    arr.sortDescending()
    println("ORI: ${arr.contentToString()}")

    // List로 변환
    val listSorted: List<Int> = arr.sorted()
    val listDesc : List<Int> = arr.sortedDescending()
    println("LST: $listSorted")
    println("LST: $listDesc")

    // SortBy로 특정 표현식에 따른 정렬
    val items = arrayOf<String>("Dog", "Cat", "Lion", "Kangaroo", "Po")
    items.sortBy { item -> item.length }
    println(items.contentToString())

}

/*
/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=52562:/Applications/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/jre/lib/charsets.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/jre/lib/ext/cldrdata.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/jre/lib/ext/dnsns.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/jre/lib/ext/jaccess.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/jre/lib/ext/jfxrt.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/jre/lib/ext/localedata.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/jre/lib/ext/nashorn.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/jre/lib/ext/sunec.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/jre/lib/ext/zipfs.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/jre/lib/jce.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/jre/lib/jfr.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/jre/lib/jfxswt.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/jre/lib/jsse.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/jre/lib/management-agent.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/jre/lib/resources.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/jre/lib/rt.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/lib/ant-javafx.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/lib/dt.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/lib/javafx-mx.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/lib/jconsole.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/lib/packager.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/lib/sa-jdi.jar:/Users/LSS/Library/Java/JavaVirtualMachines/corretto-1.8.0_292/Contents/Home/lib/tools.jar:/Users/LSS/Documents/00_Project/FirstKotlinProgramming/build/classes/kotlin/main:/Users/LSS/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-jdk8/1.4.32/3302f9ec8a5c1ed220781dbd37770072549bd333/kotlin-stdlib-jdk8-1.4.32.jar:/Users/LSS/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-jdk7/1.4.32/3546900a3ebff0c43f31190baf87a9220e37b7ea/kotlin-stdlib-jdk7-1.4.32.jar:/Users/LSS/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib/1.4.32/461367948840adbb0839c51d91ed74ef4a9ccb52/kotlin-stdlib-1.4.32.jar:/Users/LSS/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-common/1.4.32/ef50bfa2c0491a11dcc35d9822edbfd6170e1ea2/kotlin-stdlib-common-1.4.32.jar:/Users/LSS/.gradle/caches/modules-2/files-2.1/org.jetbrains/annotations/13.0/919f0dfe192fb4e063e7dacadee7f8bb9a2672a9/annotations-13.0.jar chap08.section02._03_기본적인_정렬_방법_Kt
ASC: [1, 2, 3, 4, 5, 8, 9]
DSC: [9, 8, 5, 4, 3, 2, 1]
ORI: [8, 3, 4, 2, 5, 9, 1]
ORI: [9, 8, 5, 4, 3, 2, 1]
LST: [1, 2, 3, 4, 5, 8, 9]
LST: [9, 8, 5, 4, 3, 2, 1]
[Po, Dog, Cat, Lion, Kangaroo]

Process finished with exit code 0
 */