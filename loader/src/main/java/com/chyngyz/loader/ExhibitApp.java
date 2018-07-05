package com.chyngyz.loader;

import android.app.Application;
import android.content.Context;

public class ExhibitApp extends Application {

    private RetrofitManager mRetrofitManager;

    @Override
    public void onCreate() {
        super.onCreate();
        mRetrofitManager = NetworkBuilder.initRetrofit();
    }

    public static ExhibitApp get(Context context) {
        return (ExhibitApp) context.getApplicationContext();
    }

    public RetrofitManager getRetrofitManager() {
        return mRetrofitManager;
    }
}
