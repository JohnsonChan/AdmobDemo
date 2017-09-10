package com.google.samples.quickstart.admobexample;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;


/**
 * Created by bootry on 2017/8/30.
 */

public class AdmobUtil {
//    public static String ADMOB_APP_ID = "ca-app-pub-9509252227226116~9753565043";
//    public static String ADMOB_BANNER_ID = "ca-app-pub-9509252227226116/2766081333";
//    com.uncleandroid.admobutil

//    public static String ADMOB_APP_ID = "ca-app-pub-9509252227226116~2119488782";
//    public static String ADMOB_BANNER_ID = "ca-app-pub-9509252227226116/3596221985";
//uncle.android.holdtime

//    public static String ADMOB_APP_ID = "ca-app-pub-9509252227226116~3706083323";
//    public static String ADMOB_BANNER_ID = "ca-app-pub-9509252227226116/3325318687";
//com.uncleandroid.light

    public static String ADMOB_BANNER_ID = "ca-app-pub-9509252227226116/2716612896";

    //       com.baidu.flashlight
    public static void AdmobFooterInitialize(Activity context){
        LinearLayout adlayout = new LinearLayout(context);
        adlayout.setGravity(Gravity.CENTER_HORIZONTAL);
        AdView adView = new AdView(context);
        adlayout.addView(adView);
        adView.setAdSize(AdSize.SMART_BANNER);
        adView.setAdUnitId(ADMOB_BANNER_ID);
        adView.setAdListener(new AdListener() {
            @Override
            public void onAdFailedToLoad(int i) {
                super.onAdFailedToLoad(i);
                Log.w("AdmobUtil", "onAdFailedToLoad:00" + i);
            }

            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                Log.w("AdmobUtil", "onAdFailedToLoad:11");
            }

            @Override
            public void onAdClicked() {
                super.onAdClicked();
                Log.w("AdmobUtil", "onAdFailedToLoad:22");
            }
        });
        AdRequest request = new AdRequest.Builder().build();
        adView.loadAd(request);
        FrameLayout.LayoutParams lp_Left_Bottom = new FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.WRAP_CONTENT,
                FrameLayout.LayoutParams.WRAP_CONTENT);
        lp_Left_Bottom.gravity = Gravity.BOTTOM | Gravity.CENTER;
        ((Activity) context).addContentView(adlayout,  lp_Left_Bottom);
    }
}
