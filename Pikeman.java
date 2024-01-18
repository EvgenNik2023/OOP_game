package game;

public class Pikeman extends Hero{
    public Pikeman(String nameHero) {
        super(75,
                75,
                5,
                new int[] {15, 35}, nameHero);
        rangeMaxDamage = 3;
    }
    int rangeMaxDamage;
    @Override
    public String toString() {
        return("копейщик: " + nameHero + ", здоровье: " + health + "/" + healthMax + ", броня: " + armor);
    }
}
