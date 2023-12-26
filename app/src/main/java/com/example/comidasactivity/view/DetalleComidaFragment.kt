package com.example.comidasactivity.view

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.navGraphViewModels
import com.bumptech.glide.Glide
import com.example.comidasactivity.R
import com.example.comidasactivity.viewmodel.DetalleComidaViewModel

class DetalleComidaFragment:Fragment(R.layout.fragment_detallecomida) {

    private val detallecomidasViewModel: DetalleComidaViewModel by navGraphViewModels(R.id.nav_graph)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var id:TextView=view.findViewById(R.id.textViewId)
        var nombre:TextView=view.findViewById(R.id.textViewNombre)
        var categoria:TextView=view.findViewById(R.id.textViewCategoria)
        var area:TextView=view.findViewById(R.id.textViewArea)
        var instrucciones:TextView=view.findViewById(R.id.textViewInstrucciones)
        var youtube:TextView=view.findViewById(R.id.textViewYoutube)
        var ingre1:TextView=view.findViewById(R.id.textViewIngre1)
        var ingre2:TextView=view.findViewById(R.id.textViewIngre2)
        var ingre3:TextView=view.findViewById(R.id.textViewIngre3)
        var ingre4:TextView=view.findViewById(R.id.textViewIngre4)
        var ingre5:TextView=view.findViewById(R.id.textViewIngre5)
        var ingre6:TextView=view.findViewById(R.id.textViewIngre6)
        var foto:ImageView=view.findViewById(R.id.imageViewFoto)

        detallecomidasViewModel.detalleComidaLiveData.observe(viewLifecycleOwner){
            id.text=it.id.toString()
            nombre.text=it.nombre.toString()
            categoria.text=it.categoria.toString()
            area.text=it.area.toString()
            instrucciones.text=it.instrucciones.toString()
            youtube.text=it.youtube.toString()
            ingre1.text=it.ingre1.toString()
            ingre2.text=it.ingre2.toString()
            ingre3.text=it.ingre3.toString()
            ingre4.text=it.ingre4.toString()
            ingre5.text=it.ingre5.toString()
            ingre6.text=it.ingre6.toString()
            Glide.with(view.context).load(it.foto).into(foto)
        }

    }

}