package com.blackpuppydev.bppgame.activity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.blackpuppydev.bppgame.R
import com.blackpuppydev.bppgame.adapter.GameAdapter
import com.blackpuppydev.bppgame.constance.Tag
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity(),View.OnClickListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setAdapter()





    }


    override fun onClick(p0: View?) {
        var id = p0?.id

        when{

        }

    }


    private fun setAdapter(){

        val categoryPic = getAllCategoryPic()
        val categoryName = getAllCategoryName()


        val gameAdapter = GameAdapter(categoryPic,categoryName,applicationContext){
            Log.d(Tag.home , it.toString())
            startActivity(Intent(this,GameActivity::class.java).putExtra("type",it))
        }
        adapter_game.layoutManager = LinearLayoutManager(this);
        adapter_game.adapter = gameAdapter

    }



}