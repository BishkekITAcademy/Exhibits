package com.chyngyz.loader;

import com.chyngyz.model.Exhibit;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitManager {

    @GET("/u-android/41ade05b6ae1133e7e86e9dfd55f1794/raw/bab1c383b0384d1a4c889b399ad7b13ae05634fa/ios%20challenge%20json")
    Call<Exhibit> fetchExhibitData();

}
