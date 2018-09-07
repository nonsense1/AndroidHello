package cn.com.sdzs.helloworld;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class MyApplication extends Application {
    private static MyApplication instance;
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        ARouter.openLog();
        ARouter.openDebug();
        ARouter.init(instance);
    }

    public static MyApplication getInstance() {
        return instance;
    }
}
