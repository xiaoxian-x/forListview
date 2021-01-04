package com.example.a14forlistview

import android.app.Activity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.log

class NumberAdapter(acticvity:Activity,val resourcedId:Int,data:List<Number>)
    :ArrayAdapter<Number>(acticvity,resourcedId,data) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup)
    : View {

        //提升运行效率
        val view:View
        if (convertView==null){
            view=LayoutInflater.from(context).inflate(resourcedId,parent,false)
            Log.d("listviewTset","创建新的view")
        }else{
            view=convertView
            Log.d("listviewTest","重用旧的view")
        }







        //获取listView子项布局中控件的id
        val numberImage:ImageView=view.findViewById(R.id.numImage)
        val numberName:TextView=view.findViewById(R.id.numName)

        val number=getItem(position)

        if (number!=null){
            numberImage.setImageResource(number.resourceId)
            numberName.text=number.name
        }
        return view
    }

}

/*
val view=LayoutInflater.from(context).inflate(resoursedId,parent,false)

val numberImage:ImageView=view.findViewById(R.id.numImage)
val numberName:TextView=view.findViewById(R.id.numName)

val number=getItem(position)

if (number!=null){
numberName.text=number.name
numberImage.setImageResource(number.)

 */
