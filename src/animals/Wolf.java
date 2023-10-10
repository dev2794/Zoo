package animals;

public class Wolf extends Carnivorous implements Run, Swim, Voice {
    private final String voice = "Как только стая слышит это звук, все мои волки делают АУФ!";

    public Wolf(String name, int stamina, double weight) {
        super(name, stamina, weight);
        super.voice = this.voice;
    }

    @Override
    public void run() {
        if (stamina >= staminaSpendRun) {
            stamina -= staminaSpendRun;
            System.out.println(name + " бежит!!! (и тратит " + staminaSpendRun + " выносливости)");
        } else {
            System.out.println(name + " не имеет нужного количества сил для бега.");
        }
        System.out.println("Текущая выносливость " + getStamina());
    }

    @Override
    public void swim() {
        if (stamina >= staminaSpendSwim) {
            stamina -= staminaSpendSwim;
            System.out.println(name + " плывет!!! И кто запустил хищника в водоем!?!? (тратит " + staminaSpendSwim + " выносливости)");
        } else {
            System.out.println(name + " не имеет нужного количества сил для посещения пруда.");
        }
        System.out.println("Текущая выносливость " + getStamina());
    }

    @Override
    public String voice() {
        System.out.println(name + " ощущает поддержку стаи! (плюс три выносливости!)");
        stamina += 3;
        System.out.println("Текущая выносливость " + getStamina());
        return (name + " говорит: " + voice);
    }
}
