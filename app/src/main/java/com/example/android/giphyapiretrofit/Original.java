package com.example.android.giphyapiretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Original {
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     *
     */
    public Original() {
    }

    /**
     *
     * @param url
     */
    public Original(String url) {
        super();
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
