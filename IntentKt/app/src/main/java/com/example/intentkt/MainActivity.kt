package com.example.intentkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnA.setOnClickListener {
            // var: 변수 (값을 언제든 변경 가능)
            // val: final 변수 (값을 변경할 수 없는 변수)
            val intent = Intent(this, SubActivity::class.java) // 다음 화면으로 이동하기 위한 인텐트 객체 생성.
            intent.putExtra("msg", binding.tvSendMsg.text.toString()) // Hello World라는 텍스트 값을 담은 뒤 msg 라는 열쇠로 잠갔다.
            startActivity(intent) // intent에 저장된 액티비티 쪽으로 이동.
            finish() // 자기 자신 액티비티 파괴.
        }
    }
}