package com.example.comidasactivity.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.comidasactivity.modelo.Comida
import com.example.comidasactivity.modelo.DetalleComida
import com.example.comidasactivity.modelo.ListaComidas
import kotlinx.coroutines.launch

class DetalleComidaViewModel: ViewModel() {
    val detalleComidaLiveData= MutableLiveData<DetalleComida>()
    private val listaComidas= ListaComidas()

    fun get(id:Int) {
        viewModelScope.launch {
            val detallecomida=listaComidas.getDetalleComidas(id)
            detalleComidaLiveData.postValue(detallecomida)
        }
    }
}