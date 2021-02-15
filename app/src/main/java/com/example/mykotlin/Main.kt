package com.example.mykotlin

import android.util.Log

fun main() {
    //타입은 쓰지 않아도 된다. 코틀린은 타입 추론 방식일 사용한다
    // 코틀린은 선언과 동시에 초기화를 하는 방식을 선호하기 때문에 선언을 따로 하지 않는 것이 좋
    var x: Int = 30 // Int
    var str = "Hello"

    //코틀린은 왠만하면 상수를 쓰는게 좋다
    val items = listOf(1, 2, 3, 4, 5) //list는 불변
    val items2 = arrayListOf(1, 3, 5) // 변경가능
    println(items.toString())


    items2.add(6)
    println(items2.toString())

    items2[0] = 10

    println(items2)


    loop2(items)

//    condition(x)

//    loop()

    condition2(x)

    // 자바의 클래스 선언 : Person person = new Person();
    val person = Person()
    val constructorPerson = ConstructorPerson("홍길동")
    // constructorPerson.name = 자바에서 필드, 코틀린에서 프로퍼
//    print(constructorPerson.name) // person.getName()

    val dataClass = DataClass("김영희", 20)
    print(dataClass)



}
// Unit = Void
fun plusAB (a:Int, b:Int) : Unit = print(a + b)

//if문은 코틀린에서 if식 같은 느낌, 식처럼 쓸 수 있다.
fun condition (a:Int) : Unit = if (a % 2 == 0) println("짝수") else println("홀수")

fun loop () : Unit {
    for (i in 0..9){
        println(i)
    }
}

fun loop2(numbers: List<Int>) : Unit{
    for (i in numbers) { println(i)}
}

//자바의 switch문과 when과 비슷
fun condition2 (a: Int) : Unit {
    val y = when (a) {
        1 -> print("1 입니다")
        2 -> print("2 입니다")
        3, 4, 5 -> print("3 or 4 or 5")
        in 6..10 -> print("6~10 !!")
        !in 1..10 -> print("not 1 ~ 10")
        else -> print("else")
    }

    print(y)
}

class Person{

}

// 속성값 val : 읽기전용 / var : 쓰기전용
class ConstructorPerson(val name:String) {
    // 생성자가 호출된 이후에 실행되는 블럭 : 생성자 역할을 하지만 다양한 코드 작성이 가능
    init {
        print(name)
    }

}

//데이터 클래스 -> 자바에서 사용되는 toString 재정의를 한 것 처럼 보
data class DataClass(
        val name: String,
        var age: Int
)