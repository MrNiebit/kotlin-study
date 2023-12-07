package cn.lacknb.study.b

/**
 * <h2>  </h2>
 * @description:
 * @menu
 * @author: gitsilence
 * @description:
 * @date: 2023/12/7 18:50
 **/
class Person {

    /*
    * getter 和 setter 都是可选的
    * 如果属性类型可以从初始化语句或者类的成员变量中推断出来，那就可以省去类型
    * val 不允许设置 setter 函数，因为它是只读的
    * */

    var lastName: String = "zhang"
        get() = field.uppercase()
        set

    var no: Int = 10
        get() = field
        set(value) {
            field = if (value < 10) {
                value
            } else {
                -1
            }
        }

    var height: Float = 145.4f
        // 私有set，无法给于赋值
        private set

}