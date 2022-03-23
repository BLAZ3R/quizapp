package com.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class LostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lost)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName = Constants.USER_NAME
        tv_name.text = userName


        tv_score.text = "Your Score is ${Constants.CORRECT_ANSWERS} out of ${Constants.TOTAL_QUESTIONS}. Try again))"

        btn_finish.setOnClickListener {
            startActivity(Intent(this@LostActivity, MainActivity::class.java))
        }
    }
}