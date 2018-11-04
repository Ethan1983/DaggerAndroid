package com.sample.daggerandroid;

import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import javax.inject.Inject;

import dagger.android.DaggerService;

public class MainService extends DaggerService {

    @Inject
    String value;

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException( "Bind to Main Service is not supported" );
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText( this, "Service started with [" + value + "]", Toast.LENGTH_SHORT ).show();
        return super.onStartCommand(intent, flags, startId);
    }
}
