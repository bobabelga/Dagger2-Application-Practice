
package com.bobabelga.dagger2applicationpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Boubakar";

    @Inject
    Coffee coffee,coffee2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppComponent component = ((MainApplication)getApplication()).getAppComponent();

        CoffeeComponent coffeeComponent = component.getCoffeeComponentBuilder()
                .milk(4).sugar(5).build();
        coffeeComponent.inject(this);
        Log.d(TAG, "onCreate: " +"\n Coffee 1: "+ coffee + "\n Coffee 2: "+ coffee2
                + "\n River for Coffee1: "+coffee.river + "\n River for Coffee2: " + coffee2.river
                + "\n Farm for Coffee1: "+coffee.farm + "\n Farm for Coffee2: " + coffee2.farm);
    }
}