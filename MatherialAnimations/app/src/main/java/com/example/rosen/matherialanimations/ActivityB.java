package com.example.rosen.matherialanimations;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class ActivityB extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (Build.VERSION.SDK_INT >= 21) {
//            Slide slide = new Slide();
//            slide.setDuration(5000);
//            getWindow().setEnterTransition(slide);
//            getWindow().setReturnTransition(TransitionInflater.from(this).inflateTransition(R.transition.content_transition_a));
//        }
        setContentView(R.layout.activity_b);
    }

}
