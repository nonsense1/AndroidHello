package cn.com.sdzs.helloworld.demo;

import android.util.Log;

public class Goat extends Mammal {
    private static String name = "Goat";
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void move(String destination) {
        Log.d("move", "Goat move to " + destination);
    }

    @Override
    public void drink() {
        Log.d("drink", "Goat lower it's heawd and drink");
    }
}
