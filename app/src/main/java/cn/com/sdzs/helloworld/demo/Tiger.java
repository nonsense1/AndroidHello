package cn.com.sdzs.helloworld.demo;

import android.util.Log;

public class Tiger extends Mammal implements Huntable<Animal>{
    private static String name = "Tiger";
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void move(String destination) {
        Log.d("move", "Tiger move to " + destination);
    }

    @Override
    public void drink() {
        Log.d("drink", "Tiger lower it's heawd and drink");
    }

    @Override
    public void hunt(Animal animal) {
        Log.d("hunt", "Tiger hunt " + animal.getName());
    }
}
