package lv.ressel.testapp.domain;

/**
 * Created by nikolay.ressel on 21.10.2014.
 */
public class Enchanter extends Creature {

    public Enchanter() {
        this.name = "Чародей";
        this.attack = 15;
        this.defense = 10;
        this.damageMin = 10;
        this.damageMax = 15;
        this.health = 50;
        this.speed = 4;
        this.initiative = 11;
        this.description = "В общинах снежных эльфов чародеи пользуются огромным уважением," +
                "являясь верными и могучими защитниками Снежной Империи, внушающими трепет врагам";
    }
}
