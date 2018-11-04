package com.sample.daggerandroid;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.widget.Toast;

import javax.inject.Inject;

public class MainJobService extends DaggerJobIntentService {

    private static final int JOB_ID = 1000;
    private final Handler mHandler = new Handler();

    @Inject
    String value;

    static void enqueueWork(Context context, Intent intent ) {
        enqueueWork( context, MainJobService.class, JOB_ID, intent );
    }


    @Override
    protected void onHandleWork(@NonNull Intent intent) {

        toast( "Main Job Service started [" + value + "]" );

    }

    // Helper for showing tests
    private void toast(final CharSequence text) {
        mHandler.post(new Runnable() {
            @Override public void run() {
                Toast.makeText(MainJobService.this, text, Toast.LENGTH_SHORT).show();
            }
        });
    }

}
