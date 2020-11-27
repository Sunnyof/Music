package com.sun.common;

import android.app.Application;

public class BaseApplication extends Application {

    private static BaseApplication baseApplication;

    public static BaseApplication getInstance() {
        return baseApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        baseApplication = this;
    }
}
