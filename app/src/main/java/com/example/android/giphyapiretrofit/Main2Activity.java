package com.example.android.giphyapiretrofit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main2);

        Intent i = getIntent();
        String name = i.getStringExtra("CatchData");
        Toast.makeText (Main2Activity.this, name, Toast.LENGTH_SHORT).show ();

    }
}
