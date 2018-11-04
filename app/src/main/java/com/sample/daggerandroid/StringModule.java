package com.sample.daggerandroid;

import dagger.Module;
import dagger.Provides;

@Module
abstract class StringModule {
    @Provides
    static String providesString() {
        return "FooBar";
    }
}
