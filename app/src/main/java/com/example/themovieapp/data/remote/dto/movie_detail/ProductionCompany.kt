package com.example.themovieapp.data.remote.dto.movie_detail


import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

data class ProductionCompany(
    @SerializedName("id")
    @Expose
    val id: Int,
    @SerializedName("logo_path")
    @Expose
    val logoPath: String,
    @SerializedName("name")
    @Expose
    val name: String,
    @SerializedName("origin_country")
    @Expose
    val originCountry: String
)