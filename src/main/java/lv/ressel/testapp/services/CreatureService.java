package lv.ressel.testapp.services;

import lv.ressel.testapp.domain.Creature;

import lv.ressel.testapp.domain.WinterRider;
import org.springframework.stereotype.Service;

/**
 * Created by nikolay.ressel on 12.10.2014.
 */
@Service
public class CreatureService {
    public Creature getCreatureByName (String CreatureName) {
        if (CreatureName.contains("WinterRider")) {
            Creature creature = new WinterRider();
            return creature;
        }
        return null;
    }
}

/* Обработчик типов существ
  Существо = картинка + характеристики + описание
* Контролер выбирает вьюшку
* Контролер обращается к сервису
* Сервис передаёт вьюшке нужные значения
* */