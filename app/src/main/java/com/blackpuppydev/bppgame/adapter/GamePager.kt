package com.blackpuppydev.bppgame.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.blackpuppydev.bppgame.R

class GamePager(var dataset:Array<Int>) : RecyclerView.Adapter<GamePager.GameViewHolder>() {


    class GameViewHolder(private val containerView: View): RecyclerView.ViewHolder(containerView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_category, parent, false)
        return GameViewHolder(view)
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}