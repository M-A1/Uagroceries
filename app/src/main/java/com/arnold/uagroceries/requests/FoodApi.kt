package com.arnold.uagroceries.requests

import com.arnold.uagroceries.requests.responses.FoodResponses
import retrofit2.http.GET
import retrofit2.http.Query

interface FoodApi {

    companion object {
        const val BASE_URL = "https://recipesapi.herokuapp.com"
    }

    @GET("api/get")
    suspend fun searchRecipes(
            @Query("key") key: String,
            @Query("rId") id: String
    ): FoodResponses
}