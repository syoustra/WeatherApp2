package com.syoustra.weatherapp.api_calls.google;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GoogleApiCall {

    @GET("json")
    Call<GoogleAddress> getAddress(@Query("address") String address, @Query("api_key") String apiKey);
}
