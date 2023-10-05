package food;

public abstract class Food {
    protected int staminaUpper;
    protected String name;

    Food(String name, int staminaUpper) {
        this.name = name;
        this.staminaUpper = staminaUpper;
    }

    public int getStaminaUpper() {
        return staminaUpper;
    }

    public String getName() {
        return name;
    }
}
