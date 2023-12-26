package com.example.comidasactivity.data.api

import com.example.comidasactivity.modelo.Comida

class ComidaService {
    private val retrofit=RetrofitBuilder.build()
    suspend fun get(tipo:String):CategoriaRemote {
        //con el retrofit ya le paso la interfaz
        val response=retrofit.create(ComidaApiClient::class.java).getComida(tipo)
        return response.body()!!
    }

    suspend fun getDetalle(id:Int): NodoDetalleComida? {
        val response=retrofit.create(ComidaApiClient::class.java).getReceta(id)
        return response.body()
    }
}