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
    public String getCreaturePage(Model model,  @PathVariable String creatureName) {
        Creature creature = creatureService.getCreatureByName(creatureName);
        if (creatureName == null ) {
            return "404";
        }
        if (creatureName.contains("FrostWolf") ) {
            return "FrostWolf";
        }
        if (creatureName.contains("Enchanter") ) {
            return "Enchanter";
        }
        if (creatureName.contains("WinterRider")) {
            return "WinterRider";
        }
        model.addAttribute("creaturename", creature.getName());
        return "404";
}
}
