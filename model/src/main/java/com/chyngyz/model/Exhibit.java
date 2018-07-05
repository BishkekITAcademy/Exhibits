package com.chyngyz.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Exhibit {

    @SerializedName("list")
    private ArrayList<ExhibitItem> exhibitList;

    public ArrayList<ExhibitItem> getExhibitList() {
        return exhibitList;
    }

    public class ExhibitItem {
        private String title;
        private String[] images;

        public ExhibitItem(String title, String[] images) {
            this.title = title;
            this.images = images;
        }

        public String getTitle() {
            return title;
        }

        public String[] getImages() {
            return images;
        }
    }
}
