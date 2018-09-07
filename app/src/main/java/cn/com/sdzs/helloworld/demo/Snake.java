package cn.com.sdzs.helloworld.demo;

import android.util.Log;

public class Snake extends Reptile implements Huntable<Animal>{
    private static String name = "Snake";
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void move(String destination) {
        Log.d("move", "Snake crawled to " + destination);
    }

    @Override
    public void drink() {
        Log.d("drink", "Snake dive into water and drink");
    }

    @Override
    public void hunt(Animal animal) {
        Log.d("hunt", "Snake hunt " + animal);
    }
}
