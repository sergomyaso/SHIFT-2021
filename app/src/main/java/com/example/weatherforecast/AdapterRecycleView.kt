package com.example.weatherforecast

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class AdapterRecycleView(private val onClick: (CityModel) -> Unit) :
    RecyclerView.Adapter<AdapterRecycleView.ViewHolder>() {
    var cities: ArrayList<CityModel> = ArrayList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    class ViewHolder(itemView: View?, private val onClick: (CityModel) -> Unit) :
        RecyclerView.ViewHolder(itemView!!) {
        var titleView: TextView? = null
        var countryView:TextView? = null
        init {
            if (itemView != null) {
                this.titleView = itemView.findViewById(R.id.city_list_title)
                this.countryView = itemView.findViewById(R.id.city_list_country)
            }
        }

        fun bindCity(city: CityModel) {
            titleView?.text = city.title
            countryView?.text = city.country
            itemView.setOnClickListener { onClick(city) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.city_list_item_view, parent, false)
        return ViewHolder(view, onClick)
    }

    override fun getItemCount(): Int {
        return cities.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val city = cities[position]
        holder.bindCity(city)
    }
}