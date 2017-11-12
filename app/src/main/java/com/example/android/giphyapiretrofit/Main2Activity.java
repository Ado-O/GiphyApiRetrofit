package com.example.android.giphyapiretrofit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.koushikdutta.ion.Ion;

import java.net.URL;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main2Activity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main2);

        ImageView imageView = (ImageView)findViewById (R.id.imageView);

        //catch with MainActivity
        Intent i = getIntent();
        String intValue = i.getStringExtra ("CatchData");

      //image Ion load gif
        Ion.with(this)
                .load(intValue)
                .withBitmap()
                .intoImageView(imageView);
    }
}
