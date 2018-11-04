package com.sample.daggerandroid;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class MainApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<MainApplication> applicationInjector() {

        return DaggerAppComponent.builder()
                .application(this)
                .create( this );

    }
}
