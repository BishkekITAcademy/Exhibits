package com.chyngyz.loader;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public final class NetworkBuilder {

    private static RetrofitManager sManager = null;

    public static RetrofitManager initRetrofit() {
        if (sManager == null) {
            sManager = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BuildConfig.BASE_URL)
                    .build()
                    .create(RetrofitManager.class);
        }
        return sManager;
    }

}
