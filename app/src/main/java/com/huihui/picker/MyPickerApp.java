package com.huihui.picker;

import android.app.Application;

import com.huihui.library.common.AppConfig;
import com.huihui.library.common.util.LogUtils;


/**
 * ***********************************************
 * **                ┏┓   ┏┓                    **
 * **                ┏┛┻━━━┛┻┓                  **
 * **                ┃       ┃                  **
 * **                ┃   ━   ┃                  **
 * **                ┃ ┳┛ ┗┳ ┃                  **
 * **                ┃       ┃                  **
 * **                ┃   ┻   ┃                  **
 * **                ┃       ┃                  **
 * **                ┗━┓   ┏━┛                  **
 * **                  ┃   ┃                    **
 * **                  ┃   ┃                    **
 * **                  ┃   ┗━━━┓                **
 * **                  ┃       ┣┓               **
 * **                  ┃       ┏┛               **
 * **                  ┗┓┓┏━┳┓┏┛                **
 * **                   ┃┫┫ ┃┫┫                 **
 * **                  ┗┻┛ ┗┻┛                  **
 * ***********************************************
 * **              神兽助我  扬我神威              **
 * ***********************************************
 * Author:李玉江[QQ:1032694760]
 * DateTime:2016/7/20 20:28
 * Builder:Android Studio
 */
public class MyPickerApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LogUtils.setIsDebug(BuildConfig.DEBUG);
        if (!LogUtils.isDebug()) {
            android.util.Log.d(AppConfig.DEBUG_TAG, "logcat is disabled");
        }
    }

}
