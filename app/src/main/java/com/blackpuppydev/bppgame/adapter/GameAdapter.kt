package com.blackpuppydev.bppgame.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.blackpuppydev.bppgame.R


class GameAdapter(private val drawable: Array<Int>, private val context: Context, private val callback:(Int) -> Unit)
    : RecyclerView.Adapter<GameAdapter.ViewHolder>() {

    private var tag:String = "GameAdapter"

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
          val img: ImageView = view.findViewById(R.id.img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_game, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.img.setImageDrawable(context.getDrawable(drawable[position]))
//        holder.img.setAni
        holder.img.setOnClickListener {
            callback.invoke(position)
        }
    }

    override fun getItemCount(): Int {
        return drawable.size
    }

}