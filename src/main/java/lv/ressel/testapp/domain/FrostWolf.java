package lv.ressel.testapp.domain;

/**
 * Created by nikolay.ressel on 21.10.2014.
 */
public class FrostWolf extends Creature {
    public FrostWolf() {
        this.name = "Снежный волк";
        this.attack = 7;
        this.defense = 7;
        this.damageMin = 5;
        this.damageMax = 7;
        this.health = 20;
        this.speed = 7;
        this.initiative = 12;
        this.description = "Снежные волки яростно сражаются на поле боя, не испытывая чувства страха";
        this.url ="/test-mvn-app/resources/images/Frost_wolf.jpeg";
    }
}
