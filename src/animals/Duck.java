package animals;

public class Duck extends Animals implements Fly, Swim{
    private final String voice = "Кря-кря";
    Duck(String name,int stamina, double weight) {
        super(name, stamina, weight);
        super.voice = this.voice;
    }


    @Override
    public void fly() {
        if (stamina > 0){
            stamina -= 1;
            System.out.println(name + " летит!!! (и тратит одно очко выносливости)");
        } else {
            System.out.println(name + " не имеет достаточно сил для полета.");
        }
    }
    @Override
    public void swim() {
        System.out.println(name + " плывет и восстанавливает силы (получает одно очко выносливости)");
        stamina ++;

    }
}
