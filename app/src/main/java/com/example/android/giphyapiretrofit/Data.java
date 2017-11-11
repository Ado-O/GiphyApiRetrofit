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

    public Data(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

