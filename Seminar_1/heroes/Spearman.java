package Seminar_1.heroes;

import Seminar_1.Spells;

import java.util.ArrayList;

public class Spearman extends BaseHero {

    public Spearman(String name) {
        super(200, name, 1, 6, 100, new int[]{10, 20});
    }


    @Override
    public String getInfo() {
        return "Копейщик";
    }
}
