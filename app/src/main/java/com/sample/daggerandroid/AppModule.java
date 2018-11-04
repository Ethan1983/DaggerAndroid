package com.sample.daggerandroid;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module( subcomponents = {
        MainActivityComponent.class
})
abstract class AppModule {

    @Binds
    @IntoMap
    @ClassKey(MainActivity.class)
    abstract AndroidInjector.Factory<?> bindMainActivityInjectorFactory( MainActivityComponent.Builder builder );
}
