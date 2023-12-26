package com.example.comidasactivity.view

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.findNavController
import androidx.navigation.navGraphViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.comidasactivity.R
import com.example.comidasactivity.modelo.Comida
import com.example.comidasactivity.modelo.ListaComidas
import com.example.comidasactivity.viewmodel.ComidaViewModel
import com.example.comidasactivity.viewmodel.DetalleComidaViewModel

class ComidasRemotasFragment:Fragment(R.layout.fragment_comidasremotas) {

    lateinit var adapter:ComidaRemotaAdapter
    private val comidasViewModel: ComidaViewModel by navGraphViewModels(R.id.nav_graph)
    private val detallecomidasViewModel: DetalleComidaViewModel by navGraphViewModels(R.id.nav_graph)
    private var comidas:List<Comida> = emptyList()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        comidasViewModel.comidaLiveData.observe(viewLifecycleOwner, {
            comidas=it
            var comidasRecyclerView:RecyclerView=view.findViewById(R.id.comidasRecycleView)
            comidasRecyclerView.layoutManager=LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
            adapter=ComidaRemotaAdapter(it,{
                llamarDetalle(it)
                view.findNavController().navigate(R.id.detalleComidaFragment)
            })
            comidasRecyclerView.adapter=adapter
        })
    }

    fun llamarDetalle(position: Int){
        detallecomidasViewModel.get(comidas[position].id)
    }
}