package com.example.comidasactivity.data.api

import com.google.gson.annotations.SerializedName

data class CategoriaRemote(
    @SerializedName("meals")
    val comidas:List<ComidaRemote>
)
