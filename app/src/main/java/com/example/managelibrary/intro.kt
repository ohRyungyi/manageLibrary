package com.example.managelibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class intro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        Handler().postDelayed({
            //이때, 데이터 로딩 등 정보 얻어오기
            finish()
        },2000)
    }
}