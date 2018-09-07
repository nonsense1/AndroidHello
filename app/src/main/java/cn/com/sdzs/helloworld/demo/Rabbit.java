package cn.com.sdzs.helloworld.demo;

import android.util.Log;

public class Rabbit extends Mammal {

    private static String name = "Rabbit";
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void move(String destination) {
        Log.d("move", "Rabbit move to " + destination);
    }

    @Override
    public void drink() {
        Log.d("drink", "Rabbit put out it's tongue and drink");
    }
}
