import animals.*;
import food.Food;
import food.Grass;
import food.Meat;
import worker.Worker;

import java.util.HashSet;



public class Zoo {
    public static void main(String[] args){

     Food meatFood = new Meat("мясо", 8);
     Food fishFood = new Meat("рыбу", 5);
     Food berryFood = new Grass("ягоды", 5);
     Food leafFood = new Grass("листочки", 4);
     Food grassFood = new Grass("травушку", 4);

     Wolf wolfAnimal = new Wolf("Волчара", 9, 90);
     Lynx lynxAnimal = new Lynx("Рысь", 2, 25);
     Fish fishAnimal = new Fish("Рыбка", 3, 1);
     Fish fish2Animal = new Fish("РыбкаРыбка", 1, 2.3);
     Elk elkAnimal = new Elk("Лосяш", 8, 450);
     Duck duckAnimal = new Duck("Утя", 8, 7);
     Deer deerAnimal = new Deer("Бемби", 8, 400);

     HashSet<Swim> lake = new HashSet<>();
     lake.add(wolfAnimal);
     lake.add(fishAnimal);
     lake.add(fish2Animal);
     lake.add(duckAnimal);

     swimAnimals(lake);

     Worker worker = new Worker();

     }



public static void swimAnimals(HashSet<Swim> lake){
 for (Swim swimAnimal : lake) {
  {
   swimAnimal.swim();
   System.out.println();
  }
 }}
}



    
