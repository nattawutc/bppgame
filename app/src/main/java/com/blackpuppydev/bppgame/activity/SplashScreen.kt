package com.blackpuppydev.bppgame.activity

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import com.blackpuppydev.bppgame.R

class SplashScreen : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)



//        object : CountDownTimer(3000, 5000) {
//            override fun onTick(millisUntilFinished: Long) {
//                // logic to set the EditText could go here
//            }
//
//            override fun onFinish() {
//                checkRunTimePermission()
//
////                mTextField.setText("done!")
//            }
//        }.start()




    }


    override fun onResume() {
        super.onResume()


        startActivity(Intent(this,HomeActivity::class.java))
    }
}