package com.example.paton.intent1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by paton on 3/24/2016.
 */
public class Segunda extends AppCompatActivity{
    @Override
     protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_activity);
        Intent intent= getIntent();
        Log.d("Segunda", "mensagem anexada a intent " + getIntent().getStringExtra("tag"));

    }
}
