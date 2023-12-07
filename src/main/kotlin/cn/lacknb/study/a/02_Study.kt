package cn.lacknb.study.a

/**
 * <h2>  </h2>
 * @description:
 * @menu
 * @author: gitsilence
 * @description:
 * @date: 2023/12/7 15:11
 **/

fun main() {
    print("请输入你的数字：")
    // val a = readlnOrNull()?.toInt();
    // when (val a = readlnOrNull()?.toInt()) {
    //     1,2,3,4 -> {
    //         println("你输入的是 $a, 在1,2,3,4内")
    //     }
    //     5 -> {
    //         println("你输入的是 5")
    //     }
    //     in 6..10 -> {
    //         println("你输入的是 $a, 在6-10内")
    //     }
    //     !in 11..20 -> {
    //         println("你输入的不在11-20内")
    //     }
    //     is Int -> {
    //         println("你输入的是 $a, 是Int类型")
    //     }
    //     else -> {
    //         println("你输入的不在1,2,3,4内")
    //     }
    // }

    val items = setOf("apple", "banana", "orange")
    when {
        "orange" in items -> {
            println("我知道你喜欢橘子")
        }
        "apple" in items -> {
            println("我知道你喜欢苹果")
        }
        else -> {
            println("我不知道你喜欢什么")
        }
    }

    for ((index,item) in items.withIndex()) {
        println("${index + 1}、我喜欢吃 $item")
    }

    var count = 5
    while (count > 0) {
        println("row count: $count")
        count--
    }

    do {
        println("count: ${count++}")
    } while (count < 5)

    // 标签，例如：abc@ 和 break@abc、或者continue@abc
    loop@ for (v in 3..20) {
        println("current count: $v")
        if (v == 6) {
            break@loop
        }
    }

    items.forEach { it ->
        // return 整个循环就直接退出了
        if ("apple" == it) {
            // 使用 return@forEach 跳出当前迭代，继续下一次迭代
            return@forEach
        }
        println(it)
    }
}