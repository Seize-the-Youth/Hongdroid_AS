package com.example.listviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.listviewkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    var UserList = arrayListOf<User>(
        User(R.drawable.parrot, "parrot", "17", "안녕"),
        User(R.drawable.flamingo, "flamingo", "13", "Hi"),
        User(R.drawable.duck, "duck", "11", "Hello"),
        User(R.drawable.kiwi, "kiwi", "7", "Hey"),
        User(R.drawable.pelican, "pelican", "5", "Bye"),
        User(R.drawable.kingfisher, "kingfisher", "3", "Wassup")
    )

    override fun onCreate(savedInstanceState: Bundle?) { // 액티비티 실행 시작 지점
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val item = arrayOf("cheeze", "black", "white", "calico")
//        // context라는 한 액티비티의 모든 정보를 담고 있다.
//        binding.listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)

        val Adapter = UserAdapter(this, UserList)
        binding.listView.adapter = Adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position) as User
            Toast.makeText(this, selectItem.name, Toast.LENGTH_SHORT).show()

        }
    }
}