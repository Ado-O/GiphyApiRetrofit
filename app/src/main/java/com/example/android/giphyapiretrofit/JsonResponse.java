package com.example.android.giphyapiretrofit;

import android.widget.ListAdapter;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class JsonResponse {
    @SerializedName("data")
    @Expose
    private List<Data> dataList = new ArrayList<> ();

    public List<Data> getDataList() {
        return dataList;
    }

    public JsonResponse(List<Data> dataList) {
        this.dataList = dataList;
    }

}
