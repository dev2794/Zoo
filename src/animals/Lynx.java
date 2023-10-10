package animals;

public class Lynx extends Carnivorous implements Run, Swim, Voice {
    private final String voice = "кау-кау";

    public Lynx(String name, int stamina, double weight) {
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
        this.voice.length();
        System.out.println(name + " обладает выносливостью " + getStamina() + " единиц");
        return (name + " говорит: " + voice);
    }
}
