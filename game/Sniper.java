package game;

public class Sniper extends Hero{
    public Sniper(String nameHero) {
        super(90,
                90,
                5,
                new int[] {10, 20},
                nameHero);
        rangeMaxDamage = 5;
    }
    int rangeMaxDamage;
    @Override
    public String toString() {
        return ("снайпер: " + nameHero + ", здоровье: " + health + "/" + healthMax + ", броня: " + armor);
    }
}
