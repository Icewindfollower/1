package lv.ressel.testapp.domain;

/**
 * Created by nikolay.ressel on 21.10.2014.
 */
public class WinterRider extends Creature {
    public WinterRider() {
        this.name = "Зимний всадник";
        this.attack = 12;
        this.defense = 10;
        this.damageMin = 7;
        this.damageMax = 10;
        this.health = 30;
        this.speed = 9;
        this.initiative = 12;
        this.description = "Кавалерия снежных эльфов, зимние всадники, сокрушают врагов мощным " +
                "натиском";
    }
}
