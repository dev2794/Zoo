package animals;

public class Elk extends Animals{
    Elk(int stamina, double weight, String name) {
        super(stamina, weight, name);
    }
    private final String voice = "пронзительно свистит";
    @Override
    public void eat(String food) {
    }

}
