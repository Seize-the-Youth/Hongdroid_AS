package com.example.edittextbuttonkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edittextbuttonkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) { // 액티비티가 최초 실행되면 이곳을 수행한다.
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetText.setOnClickListener { // editText에 입력된 값을 가지고 와서 텍스트뷰에 뿌리기.
            var resultText = binding.etId.text.toString() // editText에 입력되어 있는 값
            binding.tvResult.setText(resultText) // 입력된 값을 텍스트뷰에 set 해준다.
        }
    }
}