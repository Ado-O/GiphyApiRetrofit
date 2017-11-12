package com.example.android.giphyapiretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Images {
    @SerializedName("original")
    @Expose
    private String original;

    public Images(String original) {
        this.original = original;
    }

    public String getOriginal() {
        return original;
    }
}
