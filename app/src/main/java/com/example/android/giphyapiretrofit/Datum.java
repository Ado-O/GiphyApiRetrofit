package com.example.android.giphyapiretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 12.11.2017.
 */

public class Datum {
    @SerializedName("images")
    @Expose
    private Images images;
    @SerializedName("title")
    @Expose
    private String title;

    /**
     * No args constructor for use in serialization
     *
     */
    public Datum() {
    }

    /**
     *
     * @param title
     * @param images
     */
    public Datum(Images images, String title) {
        super();
        this.images = images;
        this.title = title;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
