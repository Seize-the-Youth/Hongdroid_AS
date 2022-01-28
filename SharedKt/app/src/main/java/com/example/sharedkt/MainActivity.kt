package com.example.sharedkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) { // 해당 액티비티가 처음 실행될 때 한번 수행하는 곳 (초기화)
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // TODO: 저장된 데이터를 로드
        loadData() // 저장 되어있던 edit text 값을 setText
    }

    private fun loadData() {
        val pref = getSharedPreferences("pref", 0)
        binding.etHello.setText(pref.getString("name", "")) // 첫번째 인자에서는 저장할 당시의 키 값을 적어줌, 두번째는 키 값에 데이터가 존재하지 않을 경우 대체 값을 적어준다.
    }

    private fun saveData() {
        val pref = getSharedPreferences("pref", 0)
        val edit = pref.edit() // 수정모드
        edit.putString("name", binding.etHello.text.toString()) // 첫번째 인자에는 키 값을, 두번째 인자에는 실제 담아둘 값을 넣는다.
        edit.apply() // 값 저장완료
    }

    override fun onDestroy() { // 해당 액티비티가 종료되는 시점이 다가올 때 호출
        super.onDestroy()

        saveData() // edit text 값을 저장
    }


}