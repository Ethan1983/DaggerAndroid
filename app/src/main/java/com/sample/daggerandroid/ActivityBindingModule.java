package com.sample.daggerandroid;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface ActivityBindingModule {

    @ContributesAndroidInjector( modules = MainActivityModule.class )
    MainActivity mainActivity();

}
