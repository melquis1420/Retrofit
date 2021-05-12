package com.example.retrofit

import com.google.gson.annotations.SerializedName

/**
 * Classe responsável por mapear os valores
 */
class PostModel {

    @SerializedName("id") //transforma o valor do atributo real, na variável abaixo
    val id: Int = 0

    @SerializedName("userId")
    val userId: Int = 0

    @SerializedName("title")
    val title: String = ""

    @SerializedName("body")
    val body: String = ""

}