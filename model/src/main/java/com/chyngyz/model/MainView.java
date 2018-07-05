package com.chyngyz.model;

import java.util.ArrayList;

public interface MainView {
    void showExhibitList(ArrayList<Exhibit.ExhibitItem> exhibitList);

    void showError(String error);
}
