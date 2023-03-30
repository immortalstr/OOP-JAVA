package Seminar_1.heroes;

import java.util.Random;

import Seminar_1.weapons.Weapon;

public class BaseHero {

    public String name;
    protected int x, y;
    protected Weapon weapon;
    protected int power;
    protected int speed;
    protected int healthy;
    protected int agility;
    protected int damage;
    protected int armor;

    public String toString()
    {
        return name + healthy + weapon;
    }

    public BaseHero(){


    }
}
