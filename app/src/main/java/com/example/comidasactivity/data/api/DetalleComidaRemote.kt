package com.example.comidasactivity.data.api

import com.example.comidasactivity.modelo.Comida
import com.example.comidasactivity.modelo.DetalleComida
import com.google.gson.annotations.SerializedName

class DetalleComidaRemote  (
    @SerializedName("idMeal")
    val id:Int,
    @SerializedName("strMeal")
    val nombre:String,
    @SerializedName("strMealThumb")
    var foto:String,
    @SerializedName("strCategory")
    var categoria:String,
    @SerializedName("strArea")
    var area:String,
    @SerializedName("strInstructions")
    var instrucciones:String,
    @SerializedName("strYoutube")
    var youtube:String,
    @SerializedName("strIngredient1")
    var ingre1:String,
    @SerializedName("strIngredient2")
    var ingre2:String,
    @SerializedName("strIngredient3")
    var ingre3:String,
    @SerializedName("strIngredient4")
    var ingre4:String,
    @SerializedName("strIngredient5")
    var ingre5:String,
    @SerializedName("strIngredient6")
    var ingre6:String
){
    public fun toDetalleComida(): DetalleComida = DetalleComida(
        id=this.id,
        nombre=this.nombre,
        categoria=this.categoria,
        area=this.area,
        instrucciones=this.instrucciones,
        youtube=this.youtube,
        ingre1=this.ingre1,
        ingre2=this.ingre2,
        ingre3=this.ingre3,
        ingre4=this.ingre4,
        ingre5=this.ingre5,
        ingre6=this.ingre6,
        foto=this.foto
    )


}