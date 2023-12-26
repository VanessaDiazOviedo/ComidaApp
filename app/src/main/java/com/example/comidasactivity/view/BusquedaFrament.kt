package com.example.comidasactivity.view

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.navigation.navGraphViewModels
import com.example.comidasactivity.R
import com.example.comidasactivity.viewmodel.ComidaViewModel

class BusquedaFrament: Fragment(R.layout.fragment_busqueda) {

    private val comidasViewModel:ComidaViewModel by navGraphViewModels(R.id.nav_graph)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var tipoComidaEditText: EditText =view.findViewById(R.id.editTextTipoComida)
        var buscarButton: Button =view.findViewById(R.id.buttonBuscar)
        buscarButton.setOnClickListener {
            comidasViewModel.get(tipoComidaEditText.text.toString())
            view.findNavController().navigate(R.id.comidasRemotasFragment)
        }
    }
}