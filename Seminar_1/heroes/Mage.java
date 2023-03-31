package Seminar_1.heroes;

import java.util.ArrayList;

public class Mage extends BaseHero {
    int mana; // мана
    // ArrayList<Spells> spells_book; // заклинания

    public Mage(String name) {
        super(100, name, 1, 6, 12, 2, new int[] { 1, 8 }, 10, 2, 1, 3);

        mana = 100;
    }

}