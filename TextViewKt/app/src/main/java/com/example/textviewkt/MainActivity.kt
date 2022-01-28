package com.example.textviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.textviewkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) { // 앱이 최초로 실행되었을 때 수행된다.
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // xml 화면 뷰를 연결한다.

        binding.tvTitle.setText("Hello World..!") // 텍스트의 값을 변경한다.
    }
}