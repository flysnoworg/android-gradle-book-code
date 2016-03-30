package org.flysnow.app.example911;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * @author 飞雪无情
 * @since 16-3-30 下午11:42
 */
public class Example911Application extends Application{
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
