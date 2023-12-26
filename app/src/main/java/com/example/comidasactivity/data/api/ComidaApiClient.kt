package com.example.comidasactivity.data.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ComidaApiClient {
    //llamo a mi recurso
    @GET("filter.php")
    //especificamos como va a ser la llamada
    suspend fun getComida(@Query("c") tipo:String):Response<CategoriaRemote>

    @GET("lookup.php")
    suspend fun getReceta(@Query("i") id:Int):Response<NodoDetalleComida>

}