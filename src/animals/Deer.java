package animals;

public class Deer extends Animals implements Run, Swim{
    private final String voice = "у-оооооо у-аааааа";

    public Deer(String name,int stamina, double weight) {
        super(name, stamina, weight);
        super.voice = this.voice;
    }
    @Override
    public void run() {
        if (stamina > 0){
            stamina -= 1;
            System.out.println(name + " бежит!!! (и тратит одно очко выносливости)");
        } else {
            System.out.println(name + " не имеет нужного количества сил для бега.");
        }

    }

    @Override
    public void swim() {
        if (stamina > 0){
            stamina -= 1;
            System.out.println(name + " плывет!!! И как олень в пруду оказался!? (тратит одно очко выносливости)");
        } else {
            System.out.println(name + " не имеет нужного количества сил для посещения пруда.");
        }
    }
}
