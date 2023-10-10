package animals;

public class Fish extends Herbivore implements Swim {
    private final String voice = null;

    public Fish(String name, int stamina, double weight) {
        super(name, stamina, weight);
        super.voice = this.voice;
    }

    @Override
    public void swim() {
        System.out.println(name + " плывет и чувствует себя как рыба в воде =) (не расходует выносливость)");
        System.out.println("Текущая выносливость " + getStamina());
    }
}
