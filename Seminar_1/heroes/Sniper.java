package Seminar_1.heroes;

public class Sniper extends BaseHero {
    int arrows; // сьрелы
    int accuracy; // точность

    public Sniper(String name) {
        super(100, name, 1, 6, 12, 2, new int[] { 1, 8 }, 10, 2, 1, 3);

        arrows = 10;
        accuracy = 70;
        
        // super.getInt();
    }

}
