package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Notification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        ImageView retournot=findViewById(R.id.retournot);
        retournot.setOnClickListener(v->
        {startActivity(new Intent(this,MainActivity.class));
            finish();}
        );
    }
}