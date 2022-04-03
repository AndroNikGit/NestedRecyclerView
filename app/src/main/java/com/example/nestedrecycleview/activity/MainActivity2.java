package com.example.nestedrecycleview.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.nestedrecycleview.R;

public class MainActivity2 extends AppCompatActivity {

    private ImageView iv_showimg;
    private String imgurl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        imgurl=getIntent().getStringExtra("imgurl");
        iv_showimg=(ImageView)findViewById(R.id.iv_showimg);
        Glide.with(this).load(imgurl).into(iv_showimg);
    }
}