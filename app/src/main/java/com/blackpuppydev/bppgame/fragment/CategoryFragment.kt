package com.blackpuppydev.bppgame.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.blackpuppydev.bppgame.R
import com.blackpuppydev.bppgame.adapter.CategoryAdapter
import com.blackpuppydev.bppgame.listener.FragmentListener
import kotlinx.android.synthetic.main.fragment_category.*
import java.lang.ClassCastException
import java.lang.Exception

private const val TYPE = "type"

class CategoryFragment : Fragment() {

    private lateinit var listener:FragmentListener

    private var type: Int? = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            try{
                type = it.getInt(TYPE)
                listener = context as FragmentListener
            } catch (e: Exception){

            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    override fun onResume() {
        super.onResume()
        val dataset = arrayOf(R.drawable.fruit, R.drawable.fruit,R.drawable.fruit, R.drawable.fruit,R.drawable.fruit, R.drawable.fruit,
                                R.drawable.fruit, R.drawable.fruit,R.drawable.fruit, R.drawable.fruit)

        val catAdapter = CategoryAdapter(dataset, context?.applicationContext!!){
            Log.d(tag , it.toString())
        }

        cat_adapter.layoutManager = LinearLayoutManager(context)
        cat_adapter.apply { layoutManager = GridLayoutManager(context,2) }
        cat_adapter.adapter = catAdapter

    }

    companion object {
        @JvmStatic
        fun newInstance(type: Int, param2: String) =
            CategoryFragment().apply {
                arguments = Bundle().apply {
                    putInt(TYPE, type)
                }
            }
    }
}