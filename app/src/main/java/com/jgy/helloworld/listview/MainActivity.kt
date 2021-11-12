package com.jgy.helloworld.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.jgy.helloworld.R
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private val data = listOf("Apple","Banner","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Cherry","Mango",
        "Apple","Banner","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry","Cherry","Mango")
    private val fruitList = ArrayList<Fruit>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
//        val adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data)
//        list_item.adapter = adapter
        initFruits()//初始化水果数据
        val adapter = FruitAdapter(this, R.layout.fruit_item,fruitList)
        list_item.adapter = adapter
        list_item.setOnItemClickListener { _, _, i, _ ->
            val fruit = fruitList[i]
            Toast.makeText(this,fruit.name,Toast.LENGTH_SHORT).show()
        }
    }

    private fun initFruits() {
        repeat(2){
            fruitList.add(Fruit("Apple", R.drawable.apple_pic))
            fruitList.add(Fruit("Banana", R.drawable.banana_pic))
            fruitList.add(Fruit("Orange", R.drawable.orange_pic))
            fruitList.add(Fruit("Watermelon", R.drawable.watermelon_pic))
            fruitList.add(Fruit("Pear", R.drawable.pear_pic))
            fruitList.add(Fruit("Grape", R.drawable.grape_pic))
            fruitList.add(Fruit("Pineapple", R.drawable.pineapple_pic))
            fruitList.add(Fruit("Strawberry", R.drawable.strawberry_pic))
            fruitList.add(Fruit("Cherry", R.drawable.cherry_pic))
            fruitList.add(Fruit("Mango", R.drawable.mango_pic))
        }
    }
}