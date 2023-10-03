package animals;


public class Duck extends Carnivorous implements Fly, Swim, Voice, Run{
    private final String voice = "Кря-кря";
    public Duck(String name, int stamina, double weight) {
        super(name, stamina, weight);
        super.voice = this.voice;
    }


    @Override
    public void fly() {
        if (stamina >= staminaSpendFly){
            stamina -= staminaSpendFly;
            System.out.println(name + " летит!!! (и тратит" + staminaSpendFly + "выносливости)");
        } else {
            System.out.println(name + " не имеет достаточно сил для полета.");
        }
        System.out.println("Текущая выносливость " + getStamina());
    }
    @Override
    public void swim() {
        System.out.println(name + " плывет и восстанавливает силы (получает "+ staminaUperDuckSwim + " выносливости)");
        stamina += staminaUperDuckSwim;
        System.out.println("Текущая выносливость " + getStamina());

    }
    @Override
    public String voice() {
        this.voice.length();
        System.out.println(name + " обладает выносливостью " + getStamina() + " единиц");
        return (name + " говорит: " + voice);

    }
    @Override
    public void run() {
        if (stamina >= staminaSpendRun){
            stamina -= staminaSpendRun;
            System.out.println(name + " быстро-быстро переставляет лапки! (и тратит " + staminaSpendRun +" выносливости)");
        } else {
            System.out.println(name + " не имеет нужного количества сил для бега.");
        }
        System.out.println("Текущая выносливость " + getStamina());

    }
}
