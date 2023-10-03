package animals;

import food.Food;

public abstract class Animals implements Sleep, Eat {
    protected int stamina = 5;
    protected double weight = 3.0;
    protected String name;
    protected String voice;
    private int AmountSwimAnimals = 0;

    Animals(String name) {
        this.name = name;
    }

    Animals(String name, int stamina, double weight) {
        this(name);
        this.stamina = stamina;
        this.weight = weight;
    }

    public int getStamina() {
        return stamina;
    }
    public String getName (){
        return name;
    }

    @Override
    public void sleep(){
        System.out.println(name + " спит и набирается сил (плюс " + staminaUpperSleep + " к выносливости)");
        stamina += staminaUpperSleep;
        System.out.println("Текущая выносливость " + getStamina());
    }

    @Override
   abstract public void eat(Food food);

    public int getAmountSwimAnimals() {
        return AmountSwimAnimals;
    }


}



