package animals;

public abstract class Animals {
    private int stamina;
    private double weight;
    private String name;


    Animals (int stamina, double weight, String name){
        this.stamina = stamina;
        this.weight = weight;
        this.name = name;
    }

    public abstract void eat(String food);
    public void sleep(){
        System.out.println(name + " спит и набирается сил");
        stamina += 3;
    }


}


