package com.sample.daggerandroid;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface AppModule {

    @ContributesAndroidInjector( modules = StringModule.class )
    MainActivity mainActivity();

    @ContributesAndroidInjector( modules = StringModule.class )
    MainService mainService();

}
