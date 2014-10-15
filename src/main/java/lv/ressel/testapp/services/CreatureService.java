package lv.ressel.testapp.services;

import lv.ressel.testapp.domain.Creature;

import org.springframework.stereotype.Service;

/**
 * Created by nikolay.ressel on 12.10.2014.
 */
@Service
public class CreatureService {
    public Creature getCreatureByName (String CreatureName) {
        if (CreatureName.contains("WinterRider")) {
            Creature creature = new Creature();
            creature.setName("Зимний Всадник");
            return creature;
        }
        return null;
    }
}
