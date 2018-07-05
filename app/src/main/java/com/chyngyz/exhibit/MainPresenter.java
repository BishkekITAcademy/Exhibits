package com.chyngyz.exhibit;

import com.chyngyz.model.ExhibitLoader;

public class MainPresenter implements MainContract.Presenter {

    private ExhibitLoader mExhibitLoader;

    public MainPresenter(ExhibitLoader loader) {
        this.mExhibitLoader = loader;
    }

    @Override
    public void loadData() {
        mExhibitLoader.getExhibitList();
    }
}
