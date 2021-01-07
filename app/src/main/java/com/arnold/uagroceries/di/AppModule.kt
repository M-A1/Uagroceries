package com.arnold.uagroceries.di

import com.arnold.uagroceries.requests.FoodApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)

object AppModule {


    @Provides
    @Singleton
    fun provideRetrofit() {
        val groceryRetrofitBuilder: Retrofit.Builder =
                Retrofit.Builder().baseUrl(FoodApi.BASE_URL).addConverterFactory(GsonConverterFactory.create())
    }

    @Provides
    @Singleton
    fun provideGroceryApi(retrofit: Retrofit) {
        retrofit.create(FoodApi::class.java)
    }


}