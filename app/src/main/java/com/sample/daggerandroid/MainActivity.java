package com.sample.daggerandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    @Inject
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text = findViewById( R.id.text );
        text.setText( value );

        final Intent intent = new Intent( this, MainService.class );
        startService( intent );

        final Intent jobIntent = new Intent( this, MainJobService.class);
        MainJobService.enqueueWork( this, jobIntent );

    }
}
