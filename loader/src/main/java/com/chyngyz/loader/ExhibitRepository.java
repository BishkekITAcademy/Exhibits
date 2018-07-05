package com.chyngyz.loader;

import android.content.Context;

import com.chyngyz.model.Exhibit;
import com.chyngyz.model.ExhibitLoader;
import com.chyngyz.model.MainView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ExhibitRepository implements ExhibitLoader {

    private MainView mMainView;
    private RetrofitManager mRetrofitManager;

    public ExhibitRepository(Context context, MainView view) {
        mRetrofitManager = ExhibitApp.get(context).getRetrofitManager();
        this.mMainView = view;
    }

    @Override
    public void getExhibitList() {
        mRetrofitManager.fetchExhibitData()
                .enqueue(new Callback<Exhibit>() {
                    @Override
                    public void onResponse(Call<Exhibit> call, Response<Exhibit> response) {
                        if (response.isSuccessful() && response.body() != null) {
                            mMainView.showExhibitList(response.body().getExhibitList());
                        } else {
                            mMainView.showError(response.message());
                        }
                    }

                    @Override
                    public void onFailure(Call<Exhibit> call, Throwable t) {
                        mMainView.showError(t.getMessage());
                    }
                });
    }
}
