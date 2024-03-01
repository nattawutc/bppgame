package com.blackpuppydev.bppgame.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.blackpuppydev.bppgame.R
import com.blackpuppydev.bppgame.constance.PageLanding
import com.blackpuppydev.bppgame.fragment.CategoryFragment
import com.blackpuppydev.bppgame.fragment.LevelFragment
import com.blackpuppydev.bppgame.fragment.ModeFragment
import com.blackpuppydev.bppgame.listener.FragmentListener
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : BaseActivity(),FragmentListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val type = intent.getIntExtra("mode",0)
        selectCategoryType(type)


        btn_back.setOnClickListener {
            super.onBackPressed()
        }





    }


    private fun selectCategoryType(type:Int){
        //0 = speech | 1 = choice | 2 = other
        supportFragmentManager.beginTransaction().
                add(R.id.content,CategoryFragment.newInstance(type,""),"Category").commit()
    }

    override fun onSuccess(result: String) {

    }

    override fun onPage(page: String,position:Int) {

        var targetFragment: Fragment? = null

        when(page){

            PageLanding.MODE -> {
                targetFragment = ModeFragment()
            }
            PageLanding.LEVEL -> {
                targetFragment = LevelFragment()
            }


        }

        if (targetFragment != null){
            //addToBackStack
            supportFragmentManager.beginTransaction()
                .replace(R.id.content,targetFragment,page)
                .addToBackStack(page)
                .commit()
        }



    }






}