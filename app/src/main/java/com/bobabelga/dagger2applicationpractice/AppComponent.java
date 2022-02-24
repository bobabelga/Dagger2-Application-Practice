package com.bobabelga.dagger2applicationpractice;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component (modules = RiverModule.class)
public interface AppComponent {
    CoffeeComponent.Builder getCoffeeComponentBuilder();
}
