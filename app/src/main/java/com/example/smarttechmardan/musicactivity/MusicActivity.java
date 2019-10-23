package com.example.smarttechmardan.musicactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ir.mirrajabi.viewfilter.core.ViewFilter;
import ir.mirrajabi.viewfilter.renderers.BlurRenderer;

public class MusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        /////create blur///////
        ViewFilter.getInstance(this)
                // use effect////
        .setRenderer(new BlurRenderer(30)) //blur
        .applyFilterOnView(findViewById(R.id.my_view), findViewById(R.id.root_view));
    }
}
