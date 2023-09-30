package animals;

public abstract class Animals implements Voice {
    protected int stamina = 5;
    protected double weight = 3.0;
    protected String name;
    protected String voice;

    Animals(String name) {
        this.name = name;
    }

    Animals(String name, int stamina, double weight) {
        this(name);
        this.stamina = stamina;
        this.weight = weight;
    }

    public String voice() {
        this.voice.length();
        return (name + " говорит: \"" + voice + "\"");
    }

}


