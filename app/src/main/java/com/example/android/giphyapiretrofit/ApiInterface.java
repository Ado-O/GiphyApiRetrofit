package com.example.android.giphyapiretrofit;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    //retrofit
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://api.giphy.com/v1/gifs/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    @GET("search")
    Call<TopObject> getDownsized(@Query("q") String type, @Query("api_key") String key, @Query("limit") String limit);

}
