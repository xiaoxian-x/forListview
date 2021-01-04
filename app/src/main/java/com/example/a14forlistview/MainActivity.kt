package com.example.a14forlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private val numberList=ArrayList<Number>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListView:ListView=findViewById(R.id.mylistview)


        initNumber()//初始化数据

        val adapter=NumberAdapter(this,R.id.mylistview,numberList)

        myListView.adapter=adapter


    }

    private fun initNumber() {
        repeat(3){
            numberList.add(Number("一",R.drawable.num1))
            numberList.add(Number("二",R.drawable.num2))
        }
    }
}