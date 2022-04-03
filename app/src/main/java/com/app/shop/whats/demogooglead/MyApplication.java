package com.app.shop.whats.demogooglead;

import android.app.Application;

import androidx.annotation.NonNull;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
//import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
//import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;


public class MyApplication extends Application {

    private static AppOpenManager appOpenManager;
//    private FirebaseRemoteConfig firebaseRemoteConfig;
    public static String google_InterstitilAd_Id,google_NativeAd_Id,google_BannerAd_Id,google_OpenAd_Id;

    @Override
    public void onCreate() {
        super.onCreate();
        MobileAds.initialize(
                this,
                new OnInitializationCompleteListener() {
                    @Override
                    public void onInitializationComplete(InitializationStatus initializationStatus) {}
                });


//        firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
//        FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder()
//                .setFetchTimeoutInSeconds(2).build();
//        firebaseRemoteConfig.setConfigSettingsAsync(configSettings);
//        firebaseRemoteConfig.fetch();
//        lodaFirebaseData();


    }

//    private void lodaFirebaseData() {
//        firebaseRemoteConfig.fetchAndActivate().addOnCompleteListener(new OnCompleteListener<Boolean>() {
//            @Override
//            public void onComplete(@NonNull Task<Boolean> task) {
//                if (task.isSuccessful()) {
//                    google_InterstitilAd_Id = firebaseRemoteConfig.getString("WhatsCrop_InterstitilAd");
//                    google_NativeAd_Id = firebaseRemoteConfig.getString("WhatsCrop_NativeAd");
//                    google_BannerAd_Id = firebaseRemoteConfig.getString("WhatsCrop_BannerAd");
//                    google_OpenAd_Id = firebaseRemoteConfig.getString("WhatsCrop_OpenAd");
//                    appOpenManager = new com.app.shop.whats.cropdp.until.AppOpenManager(MyApplication.this);
//                } else {
//                    google_InterstitilAd_Id="ca-app-pub-3940256099942544/1033173712";
//                    google_BannerAd_Id="ca-app-pub-3940256099942544/6300978111";
//                    google_NativeAd_Id="ca-app-pub-3940256099942544/2247696110";
//                    google_OpenAd_Id="ca-app-pub-3940256099942544/3419835294";
//                }
//            }
//        });
//    }
}

