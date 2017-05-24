import com.sun.org.apache.xerces.internal.xs.StringList

/**
 * Created by fish on 2017/5/24.
 */
fun main(args: Array<String>) {
    test1(2, 5)
    test2(9, 5)
    test3()
    var strList = ArrayList<String>()
    strList.add("abcde")
    strList.add("john")
    strList.add("luna")
    strList.add("angela")
    strList.add("cacke")
    test4(strList)
    test5("john", strList)
    test5("hello", strList)
    test6("el", "hello")
}

fun test1(x: Int, y: Int): Unit {
    if (x in 0..y - 1)
        println("Ok")
}

fun test2(x: Int, y: Int): Unit {
    if (x !in 0..y - 1)
        println("Out")
}

fun test3() {
    for (x in 1..6)
        print(x)
    println()
}

fun test4(names: ArrayList<String>) {
    for (name in names)
        println(name)
}

fun test5(name: String, names: ArrayList<String>) {
    if (name in names)
        print("yes")
    else
        print("no")
    println()
}

fun test6(name: String, names: String) {
    if (name in names)
        print("yes")
    else
        print("no")
    println()
}