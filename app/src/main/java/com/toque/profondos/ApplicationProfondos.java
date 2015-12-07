package com.toque.profondos;

import android.app.Application;

import com.socks.library.KLog;

/**
 * Created by BALAREZO on 06/12/2015.
 */
public class ApplicationProfondos extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        //<editor-fold desc="Config Library KLog">
        KLog.init(BuildConfig.LOG_DEBUG);
        //</editor-fold>

    }
}
