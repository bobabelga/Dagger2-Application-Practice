package com.bobabelga.dagger2applicationpractice;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@ActivityScope
public class Coffee {

    private static final String TAG = "Boubakar";

    @Inject
    Farm farm;

    River river;
    int sugar;
    int milk;
    @Inject
    public Coffee(River river, @Sugar int sugar,@Milk int milk) {
        this.river = river;
        this.sugar = sugar;
        this.milk = milk;
    }

    @Inject
    public void connectElectricity(){
       // Log.d(TAG, "connectElectricity: Connecting ....");
    }

    public String getCoffeeCup (){
        return farm.getBeans() +" + " + river.getWater() +" +  Sugar: " + sugar +" +  Milk: " + milk;
    }
}
