package com.syoustra.weatherapp.api_calls.dark_sky;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface  DarkSkyApi {

    @GET("{api_key}/{latitude},{longitude}")
    Call<Weather> getWeather (@Path("api_key") String apiKey, @Path("latitude") double latitude, @Path("longitude") double longitude);
}
