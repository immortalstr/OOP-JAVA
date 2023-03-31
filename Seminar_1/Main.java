package Seminar_1;

import java.util.ArrayList;

import Seminar_1.heroes.BaseHero;
import Seminar_1.heroes.Sniper;

class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> hero = new ArrayList<>();
        hero.add(new Sniper("Ivan"));
        hero.add(new Sniper("Legolas"));
        hero.add(new Sniper("Vovka"));

    }
}