package com.sample.daggerandroid;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component( modules = {
        AppModule.class,
        AndroidInjectionModule.class
})
public interface AppComponent {

    void inject( MainApplication mainApplication );

    @Component.Builder
    interface Builder {
        @BindsInstance Builder application( Application application );
        AppComponent build();
    }
}
