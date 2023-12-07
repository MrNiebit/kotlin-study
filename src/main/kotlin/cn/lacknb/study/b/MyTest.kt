package cn.lacknb.study.b

/**
 * <h2>  </h2>
 * @description:
 * @menu
 * @author: gitsilence
 * @description:
 * @date: 2023/12/7 18:55
 **/

fun main() {
    val person: Person = Person()
    person.lastName = "nie"
    println("Last name is: ${person.lastName}")

    person.no = 9
    println("no: ${person.no}")

    person.no = 20
    println("no: ${person.no}")

}