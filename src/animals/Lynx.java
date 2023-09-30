package animals;

public class Lynx extends Animals implements Run, Swim{
    private final String voice = "кау-кау";
    Lynx(String name,int stamina, double weight) {
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
            System.out.println(name + " плывет!!! И кто запустил хищника в водоем!?!? (тратит одно очко выносливости)");
        } else {
            System.out.println(name + " не имеет нужного количества сил для посещения пруда.");
        }
    }

}
