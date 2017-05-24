/**
 * Created by fish on 2017/5/24.
 */
fun main(args: Array<String>) {
    cases(1)
    println()
    cases("hello")
    println()
    cases("Hello")
    println()
    cases(cases(12190310923912039))
    println()
}

fun cases(obj: Any) {
    when (obj) {
        1 -> print("第一项")
        "hello" -> print("这是一个字符串hello")
        is Long -> print("这是一个Long类型数据")
        !is String -> print("这不是一个String类型数据")
        else -> print("else类似于Java中的default")
    }
}