package game;

public class Rogue extends Hero{
    public Rogue(String nameHero) {
        super(100,
                100,
                5,
                new int[] {20, 30}, nameHero);
        rangeMaxDamage = 4;
    }
    int rangeMaxDamage;
    @Override
    public String toString() {
        return ("разбойник: " + nameHero + ", здоровье: " + health + "/" + healthMax + ", броня: " + armor);
    }
}
