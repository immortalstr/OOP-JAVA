package Seminar_1.heroes;


public class BaseHero {

    public String name;
    int x, y;
    float hp, maxHp;
    int [] damage;
    int atk;
    int def;
    int power;
    int speed;
    int agility;
    int armor;

    public BaseHero(float hp, String name,int x, int y, int atk,int def, int[] damage,int power,int speed,int agility, int armor){
        this.hp = this.maxHp = hp;
        this.name = name;
        this.x = x;
        this.y = y;
        this.atk = atk;
        this.damage = damage;
        this.def = def;
        this.power = power;
        this.speed = speed;
        this.agility = agility;
        this.armor = armor;

    }
}
