package com.example.rosen.matherialanimations;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btnA).setOnClickListener(this);
        findViewById(R.id.btnShareA).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.btnA){
            startActivity(new Intent(this, ActivityA.class));
        } else if (id == R.id.btnShareA){
            startActivity(new Intent(this, ActivitySharedA.class));
        }
    }
}
