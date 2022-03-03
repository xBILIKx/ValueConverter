package com.example.valueconverter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.valueconverter.model.Value
import java.math.RoundingMode
import java.text.DecimalFormat

class CustomRecycleAdapter(private var items: List<Value>, private var factor: Double) : RecyclerView.Adapter<CustomRecycleAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.value_layout, parent, false)
        return MyViewHolder(itemView)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val df = DecimalFormat("#.###")
        df.roundingMode = RoundingMode.CEILING
        holder.charCodeText.text = items[position].CharCode
        holder.valueNameText.text = items[position].Name
        holder.valueText.text = "Цена: ${df.format(items[position].Value / factor)}"
    }

    override fun getItemCount() = items.size

    @SuppressLint("NotifyDataSetChanged")
    fun updateFactor(newFactor: Double){
        factor = newFactor
        notifyDataSetChanged()
    }

    @SuppressLint("NotifyDataSetChanged")
    fun update(newItems: List<Value>){
        items = newItems
        notifyDataSetChanged()
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val charCodeText: TextView = itemView.findViewById(R.id.charCode)
        val valueNameText: TextView = itemView.findViewById(R.id.valueName)
        val valueText: TextView = itemView.findViewById(R.id.value)
    }
}