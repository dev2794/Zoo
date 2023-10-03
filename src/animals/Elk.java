package animals;

public class Elk extends Herbivore implements Run, Voice{
    private final String voice = "пронзительно свистит ЭТО ФЕЕЕНОМЕНАААЛЬНО!!";
    public Elk(String name, int stamina, double weight) {
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
    public String voice() {
        this.voice.length();
        System.out.println(name + " обладает выносливостью " + getStamina() + " единиц");
        return (name + " говорит: " + voice);

    }
}
