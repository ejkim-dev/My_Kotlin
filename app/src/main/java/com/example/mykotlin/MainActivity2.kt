package com.example.mykotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        //null 이 가능하면 ?로 표시해줘야함
        var str: String?
        str = null

        val str2 = "Hello"
        print(str2.myLength())


        //자바의 Item 클래스를 사용할 수 있음
        val item = Item("홍길동")
        print(item)

        val button = Button(this)

    /*  자바처럼 사용하는 방법
       button.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                TODO("Not yet implemented")
                print("Hello")
            }

        })*/

        // 람다로 작성 가능(입력이 없기 때문에 생략됨)
        button.setOnClickListener { print("Hello") }

    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

    /** 확장함수 : 자바는 불가능하지만 코틀린은 기존 클래스에 확장함수를 추가할 수 있다. (별도의 import가 필요없다)
     안드로이드에서 코틀린을 주력언어로 사용한 이유 중 하나이다.
     기존의 코드를 건들이지 않고 버전을 업그레이드하면서 확장함수만 추가할 수 있다*/
    fun String.myLength():Int {
        return this.length
    }
}