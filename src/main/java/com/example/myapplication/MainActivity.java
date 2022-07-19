package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }

    public void radio  (View view){
        Intent vr = new Intent(this,pantalla2.class);
        startActivity(vr);
    }
    public void check  (View view){
        Intent ed = new Intent(this,pantalla3.class);
        startActivity(ed);
    }
    public void spinner  (View view){
        Intent xs = new Intent(this,pantalla4.class);
        startActivity(xs);
    }

}