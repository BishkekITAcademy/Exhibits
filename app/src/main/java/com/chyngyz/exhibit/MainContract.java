package com.chyngyz.exhibit;

import com.chyngyz.model.MainView;

public interface MainContract {

    interface View extends MainView {

    }

    interface Presenter {
        void loadData();
    }

}
