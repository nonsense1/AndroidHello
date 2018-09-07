package cn.com.sdzs.helloworld.annotaiton;

import android.support.annotation.NonNull;
import android.util.Log;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@CustomAnnotation(value = "hello",number = 1)
public class AnnoClass {

    @Check(value = "hi")
    int a;

    @Perform
    public void testMethod(){};


    boolean hasAnnotation = AnnoClass.class.isAnnotationPresent(CustomAnnotation.class);

    public void getAnnotation() {
        if (hasAnnotation){
            CustomAnnotation customAnnotation = AnnoClass.class.getAnnotation(CustomAnnotation.class);
            Log.d("number", "getAnnotation: " + customAnnotation.number());
            Log.d("value", "getAnnotation: " + customAnnotation.value());
        }
        try {
            Field a = AnnoClass.class.getDeclaredField("a");
            a.setAccessible(true);
            Check check = a.getAnnotation(Check.class);
            if (check!=null){
                Log.d("checkvalue", "getAnnotation: checkvalue is " + check.value());
            }
            Method method = AnnoClass.class.getDeclaredMethod("testMethod");
            if (method != null){
                Annotation[] ans = method.getAnnotations();
                for (int i = 0; i < ans.length; i++) {
                    Log.d("perform", "getAnnotation: " + ans[i].annotationType().getSimpleName());
                }
            }

        }catch (NoSuchFieldException e){

        }catch (NoSuchMethodException e){

        }
    }
}
