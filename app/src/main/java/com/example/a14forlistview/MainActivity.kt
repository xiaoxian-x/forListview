package com.example.a14forlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
     private val numberList=ArrayList<Number>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListView:ListView=findViewById(R.id.mylistview)


        initNumber()//初始化数据

        val adapter=NumberAdapter(this,R.layout.numberxml,numberList)

        myListView.adapter=adapter
        myListView.setOnItemClickListener(){parent,view,position,id->
            val number=numberList[position]//为什么用【position】
            Toast.makeText(this, number.name, Toast.LENGTH_SHORT).show()



        }


    }

    private fun initNumber() {
        repeat(8){
            numberList.add(Number("一",R.drawable.num1))
            numberList.add(Number("二",R.drawable.num2))
        }
    }
}