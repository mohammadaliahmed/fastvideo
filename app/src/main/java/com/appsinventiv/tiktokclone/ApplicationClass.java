package com.appsinventiv.tiktokclone;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.os.StrictMode;

import com.danikula.videocache.HttpProxyCacheServer;

import java.io.File;


/**
 * Created by AliAh on 11/04/2018.
 */

public class ApplicationClass extends Application {
    private static ApplicationClass instance;
    private HttpProxyCacheServer proxy;


    public static ApplicationClass getInstance() {
        return instance;
    }
//
    public static HttpProxyCacheServer getProxy(Context context) {
        ApplicationClass app = (ApplicationClass) context.getApplicationContext();
        return app.proxy == null ? (app.proxy = app.newProxy()) : app.proxy;
    }

    private HttpProxyCacheServer newProxy() {
        return new HttpProxyCacheServer(this);
    }



    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());

    }


}
