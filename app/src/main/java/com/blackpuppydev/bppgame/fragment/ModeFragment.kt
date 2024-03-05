package com.blackpuppydev.bppgame.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.blackpuppydev.bppgame.R
import com.blackpuppydev.bppgame.activity.GameActivity
import com.blackpuppydev.bppgame.adapter.GameAdapter
import com.blackpuppydev.bppgame.constance.PageLanding
import com.blackpuppydev.bppgame.constance.Tag
import com.blackpuppydev.bppgame.listener.FragmentListener
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_mode.*
import java.lang.Exception


class ModeFragment : Fragment() {

    private lateinit var listener: FragmentListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

            try{
                listener = context as FragmentListener
            } catch (e: Exception){

            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_mode, container, false)
    }


    override fun onResume() {
        super.onResume()


        val dataset = arrayOf(R.drawable.speech, R.drawable.choice,
            R.drawable.speech, R.drawable.choice,R.drawable.speech, R.drawable.choice)
        val modeAdapter = GameAdapter(dataset,context?.applicationContext!!){
            listener.onSuccess(it.toString(),Tag.mode)
//            listener.onPage(PageLanding.)
        }
        mode_adapter.layoutManager = LinearLayoutManager(context)
        mode_adapter.adapter = modeAdapter

    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ModeFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}