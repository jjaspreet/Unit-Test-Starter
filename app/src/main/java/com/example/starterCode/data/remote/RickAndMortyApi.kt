package com.example.starterCode.data.remote

import com.example.starterCode.data.remote.dto.RickyAndMortyDto
import retrofit2.http.GET

interface RickAndMortyApi {

    @GET("character")
    suspend fun getRickyAndMorty(): RickyAndMortyDto
}