package animals;

import food.Food;
import food.Meat;

public abstract class Carnivorous extends Animals {
    Carnivorous(String name, int stamina, double weight) {
        super(name, stamina, weight);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            stamina += food.getStaminaUpper();
            System.out.println(name + " кушает " + food.getName() + " (и получает " + food.getStaminaUpper() + " выносливости)");
        } else {
            System.out.println(name + " - плотоядное животное и не хочет есть " + food.getName());
        }
        System.out.println("Текущая выносливость " + getStamina());
    }
}

