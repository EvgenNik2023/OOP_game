package game;

public class Monk extends Hero{
    public Monk(String nameHero) {
        super(50,
                50,
                1,
                new int[] {-10, -5}, nameHero);
    }

    @Override
    public String toString() {
        return("монах: " + nameHero + ", здоровье: " + health + "/" + healthMax + ", броня: " + armor);
    }
}
