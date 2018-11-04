package com.sample.daggerandroid;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Component( modules = {
        ActivityBindingModule.class,
        AndroidSupportInjectionModule.class
})
public interface AppComponent extends AndroidInjector<MainApplication> {

    void inject( MainApplication mainApplication );

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<MainApplication> {
        @BindsInstance abstract Builder application( Application application );
    }
}
