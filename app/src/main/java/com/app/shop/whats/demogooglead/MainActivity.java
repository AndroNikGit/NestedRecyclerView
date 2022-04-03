package com.app.shop.whats.demogooglead;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private FrameLayout adContainerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NativeUtils.ShownativeAd(MainActivity.this);
        adContainerView = findViewById(R.id.ad_view_container);
        BannerUtils.ShowbannerAd(MainActivity.this,adContainerView);


    }

    @Override
    public void onBackPressed() {
        InterstitialUtils.getInterstitialUtils().showInterstitialAd(this, new InterstitialUtils.AdClosedListener() {
            @Override
            public void onAdClosed() {
                finish();
            }
        });
//        super.onBackPressed();
    }
}