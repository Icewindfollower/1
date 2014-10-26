package lv.ressel.testapp.domain;

/**
 * Created by nikolay.ressel on 26.10.2014.
 */
public class User {
    protected String name;
    protected int attack = 30;
    protected int defense = 30;
    protected int damageMin = 25;
    protected int damageMax = 50;
    protected int health = 100;
    protected int speed = 5;
    protected int initiative = 10;
    protected int moral = 0;
    protected int luck = 0;
    protected int rage = 0;
    protected int fear = 0;
    protected String description;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getDamageMin() {
        return damageMin;
    }

    public int getDamageMax() {
        return damageMax;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public int getInitiative() {
        return initiative;
    }

    public int getMoral() {
        return moral;
    }

    public int getLuck() {
        return luck;
    }

    public int getRage() {
        return rage;
    }

    public int getFear() {
        return fear;
    }

    public String getDescription() {
        return description;
    }


}
