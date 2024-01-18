package game;

public class Peasant extends Hero{
    public Peasant(String nameHero) {
        super(40,
                40,
                1,
                new int[] {-35, -30}, nameHero);
    }

    @Override
    public String toString() {
        return("крестьянин: " + nameHero + ", здоровье: " + health + "/" + healthMax + ", броня: " + armor);
    }
}
