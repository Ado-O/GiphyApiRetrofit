package com.example.android.giphyapiretrofit;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class TopObject {

  @SerializedName("data") List<Datum> data;

  public List<Datum> getData() {
    return data;
  }

  public TopObject setData(List<Datum> data) {
    this.data = data;
    return this;
  }
}
