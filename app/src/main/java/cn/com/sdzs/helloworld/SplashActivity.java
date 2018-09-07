package cn.com.sdzs.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.launcher.ARouter;

import cn.com.sdzs.helloworld.Utils.ConfigUtils;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String isLogin = ConfigUtils.getAppConfigProperties().getProperty("IsLogin");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();
        if (isLogin.equals("true")){
            ARouter.getInstance().build("/test/entry").navigation();
        }else {
            ARouter.getInstance().build("/test/login").navigation();
        }

    }
}
