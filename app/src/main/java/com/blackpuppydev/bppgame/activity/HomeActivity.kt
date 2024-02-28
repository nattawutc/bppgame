package com.blackpuppydev.bppgame.activity

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.blackpuppydev.bppgame.R
import com.blackpuppydev.bppgame.adapter.GameAdapter
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity(),View.OnClickListener {

    private var tag :String = "HomeActivity"

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
        val dataset = arrayOf(R.drawable.speech, R.drawable.choice,
            R.drawable.speech, R.drawable.choice,R.drawable.speech, R.drawable.choice)
        val gameAdapter = GameAdapter(dataset,applicationContext){
            Log.d("HomeActivity : " , it.toString())
        }
        adapter_game.layoutManager = LinearLayoutManager(this);
        adapter_game.adapter = gameAdapter

    }



}