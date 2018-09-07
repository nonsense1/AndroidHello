package cn.com.sdzs.helloworld.Retrofit;

import android.util.Log;

import static android.content.ContentValues.TAG;

public class Translation {
    private int status;
    private Content content;
    private static class Content {
        private String from;
        private String to;
        private String vendor;
        private String out;
        private int err_no;
    }

    public void show(){
        Log.d(TAG, "show: " + status +"\n" + content.from + "\n"
        + content.to + "\n" + content.vendor + "\n" + content.out + "\n"
        + content.err_no);
    }
}
