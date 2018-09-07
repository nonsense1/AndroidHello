package cn.com.sdzs.helloworld.demo;

import android.util.Log;

public class Farmer {
    private void bringWater(String destiantion){
        Log.d("bringWater", "bringWater to " + destiantion);
    }
    private void bringAnimal(Animal animal, String destination){
        Log.d("bringAnimal", "bringAnimal to" + destination);
    }
    public void feedWater(Animal animal) {
        bringWater("饲养室");
        animal.move("饲养室");
        animal.drink();
    }
    public void feedAnimal(Huntable hunt, Animal animal){
        bringAnimal(animal,"饲养室");
        Animal a = (Animal) hunt;
        a.move("饲养室");
        hunt.hunt(animal);
    }
}
