package animals;

public class Fish extends Animals {
    private String voice;
    public Fish(int stamina, double weight, String name) {
        super(stamina, weight, name);
    }

    @Override
    public void eat(String food) {
    }

//    @Override
//    public String voice() throws NullPointerException {
//
//       return(voice);
//    }
}
