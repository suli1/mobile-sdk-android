package com.jumio.sample;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by suli on 2017/12/11.
 */

public class App extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
