package com.arnold.uagroceries.data;

import com.arnold.uagroceries.requests.FoodApi;
import com.arnold.uagroceries.requests.responses.FoodResponses;

import javax.inject.Inject;

import retrofit2.Call;

public class FoodRepository implements FoodApi {

    @Inject
    private FoodApi foodApi;

    @Override
    public Call<FoodResponses> getRecipe(String key, String id) {
        return null;
    }
}
