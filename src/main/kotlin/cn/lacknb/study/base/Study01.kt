package cn.lacknb.study.base

/**
 * <h2>  </h2>
 * @description:
 * @menu
 * @author: nbh
 * @description:
 * @date: 2023/3/10 10:31
 **/
class Study01 {

    fun add(a: Int, b: Int) : Int {
        return a + b
    }

}

fun main() {
    val study = Study01()
    val add = study.add(5, 6)
    println(add)
}
