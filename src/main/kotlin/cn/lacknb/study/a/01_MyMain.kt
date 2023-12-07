package cn.lacknb.study.a


/**
 * <h2>  </h2>
 * @description:
 * @menu
 * @author: gitsilence
 * @description:
 * @date: 2023/12/6 17:24
 **/
fun main(args: Array<String>) {
    println("Hello Kotlin !")
    Greeter("张三").greet()
    println(sum(5, 10))

    // 表达式作为函数体，返回类型自动推断
    fun q(a: Int, b: Int) = a + b
    println(q(5, 10))

    // 可变长参数
    println(sum(1, 2, 3))

    // lambda 匿名函数
    val sum_lambda = {x: Int, y: Int -> x + y}
    val sumLambda: (Int, Int) -> Int = {x, y -> x + y}
    println(sumLambda(5, 10))
    println(sum_lambda(5, 10))

    // 定义常量和变量
    // var xx : 类型 = 初始值
    // 可变变量
    var a: Int = 1

    // 不可变变量
    val b: Int = 2

    // 字符串模板
    // 变量值
    val c = "Tom"
    val d = "My name is $c"
    println(d)

    //变量的方法返回值
    val person = Greeter();
    person.name = "Alice";
    val e = "My name is -> ${person.getPersonName()}"
    println(e)

    // 数据类
    val user = User("Tom", 20)
    println(user)

    // 集合 arrayListOf 是可变的，listOf 是不可变的
    val userList = listOf(User("Tom", 20), User("Alice", 21))
    println(userList)
    println(userList::class.simpleName)
    val sortedUserList = userList.sortedBy { u -> u.age }.reversed()
    println(sortedUserList)
    println(sortedUserList::class.simpleName)

    val filter = sortedUserList.filter { u -> u.age > 20 }
    println(filter)

    val testList = arrayListOf(1, 2, 3, 4, 5)
    testList.add(6)
    println(testList)

    val number = getNumber(1)
    println(number)

    for(i in 1..5) {
        println(i)
    }

    for(i in 4..1) {
        println(i)
    }

    for(i in 1..5 step 2) {
        println(i)
    }

    for(i in 4 downTo 1 step 2) {
        println(i)
    }

    for(i in 1 until 10) {
        println(i)
    }

    val money = 1_000_000
    println(money::class.simpleName)

    var content = """
        |多行 字符串 
        |多行 字符串
        | 多行 字符串
    """
    println(content)
    // 把空格去掉了
    println(content.trimIndent())

    content = """
        |多行字 符串测试 
        |  多行字 符串测试
        #  多行字 符串测试
    """.trimMargin("|").trimMargin("#")
    // 可以自定义 # 或 | 为管道符
    println(content)


}

fun getNumber(num: Int): Int? {
    return if (num == 1) null else num
}

/**
 * 定义一个函数，接收两个参数，返回一个Int类型的值
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum(vararg nums: Int): Int {
    var sum = 0;
    for(num in nums) {
        sum += num
    }
    return sum
}

/**
 * val和var用于定义变量，它们的区别在于是否可以重新赋值
 * val定义的变量是只读的，即定义后不能重新赋值，只能赋值一次。赋值语句后会编译错误
 * var 定义的变量是可以变的，可以随时重新赋值
 *
 * String? 类型后面加?号，表示可空
 */
class Greeter(var name: String? = null) {
    constructor() : this(null)
    fun greet() {
        println("Hello $name")
    }

    /**
     * 这里不能用getName，会自动生成的get-name方法起冲突
     */
    fun getPersonName(): String? {
        return this.name
    }
}