package lv.ressel.testapp.domain;

/**
 * Created by nikolay.ressel on 12.10.2014.
 */
public abstract class Creature {
    protected String name;
    protected int attack;
    protected int defense;
    protected int damageMin;
    protected int damageMax;
    protected int health;
    protected int speed;
    protected int initiative = 10;
    protected int moral = 0;
    protected int luck = 0;
    protected int rage = 0;
    protected int fear = 0;
    protected String description;

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
