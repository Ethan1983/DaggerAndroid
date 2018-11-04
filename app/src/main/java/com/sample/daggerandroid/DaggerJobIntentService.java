package com.sample.daggerandroid;

import android.support.v4.app.JobIntentService;

import dagger.android.AndroidInjection;

public abstract class DaggerJobIntentService extends JobIntentService {

    @Override
    public void onCreate() {
        AndroidInjection.inject( this );
        super.onCreate();
    }
}
