package com.example.android.giphyapiretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 12.11.2017.
 */

public class Images {
    @SerializedName("original")
    @Expose
    private Original original;

    /**
     * No args constructor for use in serialization
     *
     */
    public Images() {
    }

    /**
     *
     * @param original
     */
    public Images(Original original) {
        super();
        this.original = original;
    }

    public Original getOriginal() {
        return original;
    }

    public void setOriginal(Original original) {
        this.original = original;
    }
}
