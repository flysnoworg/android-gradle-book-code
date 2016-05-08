package org.flysnow.app.example122;

import android.content.Context;

/**
 * @author 飞雪无情
 * @since 16-5-9 上午12:51
 */
public class Utils {
    private Context mContext;

    public Utils(Context context) {
        this.mContext = context;
    }
    public String getAppName(){
        return String.valueOf(mContext.getString(R.string.app_name));
    }
}
