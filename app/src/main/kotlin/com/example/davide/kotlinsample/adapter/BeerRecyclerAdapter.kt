package com.example.davide.kotlinsample.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.davide.kotlinsample.R
import com.example.davide.kotlinsample.models.Beer
import kotlinx.android.synthetic.main.item_beer.view.*

class BeerRecyclerAdapter(val list: MutableList<Beer>?, val itemClick: (Beer?) -> Unit) :
        RecyclerView.Adapter<BeerRecyclerAdapter.ViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_beer, parent, false)
        return ViewHolder(view, itemClick)
    }

    override fun onBindViewHolder(holder: BeerRecyclerAdapter.ViewHolder, position: Int) {
        holder.bindViewHolder(list?.get(position))
    }

    override fun getItemCount(): Int {
        return if (list != null) list.size else 0
    }

    class ViewHolder(val view: View, val itemClick: (Beer?) -> Unit) : RecyclerView.ViewHolder(view) {
        fun bindViewHolder(beer: Beer?) {
            with(beer) {
                itemView.beerTitleId.text = this?.name
                itemView.beerDescriptionId.text = this?.contributed_by
                itemView.setOnClickListener { itemClick.invoke(this) }
            }

        }
    }
}