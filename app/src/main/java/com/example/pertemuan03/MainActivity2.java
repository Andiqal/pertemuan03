package com.example.pertemuan03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void biotoHome(View view) {
        Intent a = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(a);
    }

    public void biotoar(View view) {
        Intent a = new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(a);
    }
}