package com.example.android.giphyapiretrofit;

import android.media.Image;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

class Data {
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("images")
    @Expose
    public String images;

    public Data(String title, String images) {
        this.title = title;
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public String getImages() {
        return images;
    }
}

