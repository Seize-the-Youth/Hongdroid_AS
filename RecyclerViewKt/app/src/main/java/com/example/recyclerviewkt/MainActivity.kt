package com.example.recyclerviewkt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val profileList = arrayListOf(
            Profiles(R.drawable.user1, "채성아", 25, "해바라기반 담임"),
            Profiles(R.drawable.user2, "김한석", 26, "채성아 남편"),
            Profiles(R.drawable.user3, "나미리", 27, "장미반 담임"),
            Profiles(R.drawable.user4, "권지옹", 28, "유치원 원장선생님")
        )

        binding.rvProfile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvProfile.setHasFixedSize(true)
        binding.rvProfile.adapter = ProfileAdapter(profileList)

    }
}