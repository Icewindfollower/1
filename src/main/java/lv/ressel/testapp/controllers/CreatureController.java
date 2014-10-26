package lv.ressel.testapp.controllers;

import lv.ressel.testapp.domain.Creature;
import lv.ressel.testapp.services.CreatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by nikolay.ressel on 12.10.2014.
 */

@Controller
public class CreatureController {
    @Autowired
    private CreatureService creatureService;

    @RequestMapping(value = "/creature/{creatureName}")
    public String getCreaturePage(Model model, @PathVariable String creatureName) {
        Creature creature = creatureService.getCreatureByName(creatureName);
        if (creature != null) {
            model.addAttribute("creature",creature);
            return "Creature";
        } else {
            return "404";
        }
    }
}
