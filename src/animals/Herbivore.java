package animals;

import food.Food;
import food.Grass;
import food.Meat;

public abstract class Herbivore extends Animals{
    Herbivore(String name, int stamina, double weight) {
        super(name, stamina, weight);
    }
    @Override
    public void eat(Food food) {
        if (food instanceof Grass){
            stamina += food.getStaminaUpper();
            System.out.println(name + " кушает " + food.getName() + " (и получает " + food.getStaminaUpper() + " выносливости)");
        } else {
            System.out.println(name + " - травоядное животное и не хочет есть " + food.getName());
        }
        System.out.println("Текущая выносливость " + getStamina());
    }
}
