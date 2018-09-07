package cn.com.sdzs.helloworld.ARouter;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.launcher.ARouter;

import static android.content.ContentValues.TAG;

@Interceptor(priority = 3, name = "login interceptor")
public class LoginInterceptor implements IInterceptor {
    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        if (postcard.getExtra() != 1){
            Log.d(TAG, "process: need login!");
            ARouter.getInstance().build("/test/login").navigation();

        }else {
            callback.onContinue(postcard);
        }
    }

    @Override
    public void init(Context context) {

    }
}
