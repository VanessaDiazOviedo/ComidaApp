package com.example.comidasactivity.data.api

import com.example.comidasactivity.modelo.Comida
import com.google.gson.annotations.SerializedName

data class ComidaRemote(
    @SerializedName("idMeal")
    val id:Int,
    @SerializedName("strMeal")
    val descripcion:String,
    @SerializedName("strMealThumb")
    var foto:String
) {
    public fun toComida(): Comida=Comida(
        id=this.id,
        descripcion=this.descripcion,
        foto=this.foto
    )


}
