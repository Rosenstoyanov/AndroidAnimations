package com.example.rosen.matherialanimations;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.ActionBarActivity;
import android.transition.TransitionInflater;
import android.view.View;
import android.widget.Button;

public class ActivitySharedA extends ActionBarActivity implements View.OnClickListener {


    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setSharedElementExitTransition(TransitionInflater.from(this).inflateTransition(R.transition.shared_element_transition_a));
        }
        setContentView(R.layout.activity_shared_a);
        mButton1 = (Button) findViewById(R.id.button_1);
        mButton2 = (Button) findViewById(R.id.button_2);
        mButton3 = (Button) findViewById(R.id.button_3);
        mButton4 = (Button) findViewById(R.id.button_4);

        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);


    }

    @SuppressLint("NewApi")
    @Override
    public void onClick(View v) {
        v.setTransitionName("selectedButton");
        ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this, v, v.getTransitionName());

        Intent intent = new Intent(this, ActivitySharedB.class);
        startActivity(intent, optionsCompat.toBundle());
    }
}
