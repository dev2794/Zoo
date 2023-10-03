package worker;

import animals.Animals;
import animals.Voice;
import food.Food;

public class Worker {
   public void feed(Animals animal, Food food){
        animal.eat(food);
    }
    public void getVoice(Voice animal){
        System.out.println(animal.voice());
    }
}
