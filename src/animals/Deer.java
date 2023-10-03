package animals;

public class Deer extends Herbivore implements Run, Swim, Voice{
    private final String voice = "у-оооооо у-аааааа";

    public Deer(String name,int stamina, double weight) {
        super(name, stamina, weight);
        super.voice = this.voice;
    }
    @Override
    public void run() {
        if (stamina >= staminaSpendRun){
            stamina -= staminaSpendRun;
            System.out.println(name + " бежит!!! (и тратит " + staminaSpendRun +" выносливости)");
        } else {
            System.out.println(name + " не имеет нужного количества сил для бега.");
        }
        System.out.println("Текущая выносливость " + getStamina());

    }

    @Override
    public void swim() {
        if (stamina >= staminaSpendSwim){
            stamina -= staminaSpendSwim;
            System.out.println(name + " плывет!!! И как олень в пруду оказался!? (тратит " + staminaSpendSwim + " выносливости)");
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
