package com.app.shop.whats.demogooglead;

import android.app.Activity;
import android.content.Context;

import androidx.annotation.NonNull;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;


public class InterstitialUtils {
    //    Testinf Ads ID
    private String intertial_unit_app_id = "ca-app-pub-3940256099942544/1033173712";
    public static String banner_id = "ca-app-pub-3940256099942544/6300978111";
    public static String native_id = "ca-app-pub-3940256099942544/2247696110";

    private static InterstitialUtils intertialUtils;
    private InterstitialAd mInterstitialAd;
    private AdClosedListener adClosedListener;
    private boolean isReloaded = false;
    private static long lastTimeShowIntertitial = 0;

    public static InterstitialUtils getInterstitialUtils() {
        if (intertialUtils == null) {
            intertialUtils = new InterstitialUtils();
            lastTimeShowIntertitial = (System.currentTimeMillis() - getLimitTime());
        }
        return intertialUtils;
    }

    public void init(@NonNull final Context context) {
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(context, intertial_unit_app_id, adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                mInterstitialAd = null;
                if (!isReloaded) {
                    isReloaded = true;
                    init(context);
                }
            }
        });
    }

    public void showInterstitialAd(final Activity activity, @NonNull final AdClosedListener adClosedListener) {
        final long currentime = System.currentTimeMillis();
        if (currentime - lastTimeShowIntertitial >= getLimitTime()) {
            if (canShowInterstitialAd()) {
                isReloaded = false;
                this.adClosedListener = adClosedListener;
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        if (adClosedListener != null) {
                            adClosedListener.onAdClosed();
                        }
                        startTimer(activity);
                        // Called when fullscreen content is dismissed.
                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        if (adClosedListener != null) {
                            adClosedListener.onAdClosed();
                        }
                        startTimer(activity);
                        // Called when fullscreen content failed to show.
                    }

                    @Override
                    public void onAdShowedFullScreenContent() {
                        lastTimeShowIntertitial = currentime;
                        // Called when fullscreen content is shown.
                        // Make sure to set your reference to null so you don't
                        // show it a second time.
                    }
                });
                mInterstitialAd.show(activity);
            } else {
                init(activity);
                adClosedListener.onAdClosed();
            }
        } else {
            this.adClosedListener = adClosedListener;
            adClosedListener.onAdClosed();
        }
    }

    private boolean canShowInterstitialAd() {
        return mInterstitialAd != null;
    }

    private static long getLimitTime() {
        return 2;
    }

    public interface AdClosedListener {
        public void onAdClosed();
    }

    public void stopAds() {
        mInterstitialAd = null;
    }

    private void startTimer(Context context) {
        init(context);
    }
}
