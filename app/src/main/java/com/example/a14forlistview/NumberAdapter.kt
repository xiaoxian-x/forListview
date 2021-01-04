package com.example.a14forlistview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class NumberAdapter(acticvity:Activity,val resoursedId:Int,data:List<Number>)
    :ArrayAdapter<Number>(acticvity,resoursedId,data) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup)
    : View {

        val view=LayoutInflater.from(context).inflate(resourcedId,parent,false)

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
