package com.app.shop.whats.demogooglead;

import static com.app.shop.whats.demogooglead.InterstitialUtils.banner_id;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.widget.FrameLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class BannerUtils {

    //    ad Activity
//    adContainerView = findViewById(R.id.ad_view_container);
//        BannerUtils.ShowbannerAd(MainActivity.this,adContainerView);
    private static AdView adView;

    public static void ShowbannerAd(Activity activity, FrameLayout adContainerView) {
        adView = new AdView(activity);
        adView.setAdUnitId(banner_id);
        adContainerView.addView(adView);
        loadBanner(activity);
    }

    private static void loadBanner(Activity activity) {
        AdRequest adRequest = new AdRequest.Builder().build();
        AdSize adSize = getAdSize(activity);
        adView.setAdSize(adSize);
        adView.loadAd(adRequest);
    }

    private static AdSize getAdSize(Activity activity) {
        Display display = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);
        float widthPixels = outMetrics.widthPixels;
        float density = outMetrics.density;
        int adWidth = (int) (widthPixels / density);
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(activity, adWidth);
    }

}
