package com.example.comidasactivity.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.comidasactivity.R
import com.example.comidasactivity.modelo.Comida

class ComidaRemotaAdapter(val comidas: List<Comida>, val onItemDom: (Int) -> Unit) :
    RecyclerView.Adapter<ComidaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComidaViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_comidas, parent, false)

        return ComidaViewHolder(view, onItemDom)
    }

    override fun getItemCount(): Int = comidas.size

    override fun onBindViewHolder(holder: ComidaViewHolder, position: Int) {
        holder.render(comidas[position])

        // Llamada a onItemDom en el click del elemento
        holder.itemView.setOnClickListener {
            onItemDom(position)
        }
    }
}

