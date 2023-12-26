package com.example.comidasactivity.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.comidasactivity.modelo.Comida
import com.example.comidasactivity.modelo.ListaComidas
import kotlinx.coroutines.launch

class ComidaViewModel:ViewModel() {
    val comidaLiveData=MutableLiveData<List<Comida>>()
    private val listaComidas= ListaComidas()

    fun get(tipo:String) {
        viewModelScope.launch {
            val comidas=listaComidas.getComidas(tipo)
            comidaLiveData.postValue(comidas)
        }
    }
}