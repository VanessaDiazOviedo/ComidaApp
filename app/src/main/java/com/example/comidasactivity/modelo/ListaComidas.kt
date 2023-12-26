package com.example.comidasactivity.modelo

import com.example.comidasactivity.data.api.ComidaService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ListaComidas {

    private val api=ComidaService()
    private val comidas:List<Comida> = listOf()


    fun getComidas():List<Comida> =comidas

    suspend fun getComidas(tipo:String):List<Comida> {
        return withContext(Dispatchers.IO) {
            api.get(tipo).comidas.map { it->it.toComida() }
        }
    }

    suspend fun getDetalleComidas(id:Int):DetalleComida {
        return withContext(Dispatchers.IO) {
            api.getDetalle(id)?.detalleComida?.get(0)?.toDetalleComida()!!
        }
    }

}