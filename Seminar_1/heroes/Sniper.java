package Seminar_1.heroes;

public class Sniper extends BaseHero {
    int arrows;
    int accuracy;

    public Sniper(float hp, String name, int x, int y, int atk, int def, int[] damage, int power, int speed,
            int agility, int armor) {
        super(7, "radagas", 1, 6, 12, 2, new int[] { 1, 8 }, 10, 2, 1, 3);
        arrows = 10;
        accuracy = 70;
    }

}
