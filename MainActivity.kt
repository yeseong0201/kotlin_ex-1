package com.example.ys020.kotlin_ex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {  // extends 대신 : 사용

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tv:TextView = findViewById(R.id.tv)
        tv.setText("Hello kotlin 1")

        tv2.setText("hello world 2")

        var button = findViewById(R.id.button) as Button // val은 값을 변경할 수 없음. java에서의 final과 같다.
        button.setOnClickListener( {
            var temp:String?=null // null을 포함할 수 있는 변수, null로 초기화된다.
              // var은 mutable한 자료형, 값을 계속 수정할 수 있음.
            temp = tv.text.toString()
            tv.setText(tv2.text)
            tv2.setText(temp)

        })
    }
}
