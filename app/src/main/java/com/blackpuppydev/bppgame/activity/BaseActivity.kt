package com.blackpuppydev.bppgame.activity

import android.Manifest
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.blackpuppydev.bppgame.R

open class BaseActivity : AppCompatActivity() {

    private var tag :String = "BaseActivity"
//    private var statusReg:Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)

        supportActionBar?.hide()





    }


    fun checkRunTimePermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(permission, permissionMultipleRequest)
        } else {
            // if already permition granted
            // PUT YOUR ACTION (Like Open cemara etc..)
        }
    }


    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (grantResults.isNotEmpty()){
            val audioPermission:Boolean = grantResults[0] == PackageManager.PERMISSION_GRANTED
            val readExternalFile:Boolean = grantResults[1] == PackageManager.PERMISSION_GRANTED

            Log.d(tag,"this permission : $audioPermission <-> $readExternalFile")

            if (audioPermission && readExternalFile) return
            if (!audioPermission) requestPermissions(arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),1)
            if (!readExternalFile) requestPermissions(arrayOf(Manifest.permission.RECORD_AUDIO),1)
        }
    }





    private val permissionMultipleRequest = 111;
    private val permission = arrayOf(Manifest.permission.RECORD_AUDIO,Manifest.permission.READ_EXTERNAL_STORAGE)

}