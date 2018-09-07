package cn.com.sdzs.helloworld.annotaiton;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
    int number() default 0;
    String value() default "";
}
