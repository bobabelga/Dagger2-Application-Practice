package com.bobabelga.dagger2applicationpractice;

import android.util.Log;

import javax.inject.Inject;

public class River {
    private static final String TAG = "Boubakar";


    public River() {
        //Log.d(TAG, "River: ");
    }

    public String getWater() {
        return "Water";
    }
}
