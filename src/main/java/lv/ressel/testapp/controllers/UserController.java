package lv.ressel.testapp.controllers;

import lv.ressel.testapp.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import lv.ressel.testapp.services.UserService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{userName}")
    public String getMainPage(Model model, @PathVariable String userName) {
        User user = userService.getUserName(userName);
        DAOExampleObject daoExampleObject = userService.getAttackFromDao();
        if (user == null) {
            return "404";
        }
        List<SlotInfo> slots = new ArrayList<SlotInfo>();
        for (int i = 0; i < 7; i++) {
            SlotInfo s = new SlotInfo();
            s.setSlotNumber(i);
            if (userService.getCreaturesByUserId(userName).get(i) != null) {
                s.setUrl(userService.getCreaturesByUserId(userName).get(i).getUrl());
                s.setCreature(userService.getCreaturesByUserId(userName).get(i));
            } else {
                s.setUrl(new EmptySlot().getUrl());
            }
            slots.add(s);
        }
        model.addAttribute("slots", slots);
        model.addAttribute("user", user);
        model.addAttribute("DAOExampleObject", daoExampleObject.getAttack());

        Map<Integer, Creature> creaturesByUserId = userService.getCreaturesByUserId(userName);
        model.addAttribute("creatures", creaturesByUserId.values());

        return "User";
    }

    @RequestMapping(value = "/user/{userName}", method = RequestMethod.POST)
    public String addCreature(Model model, @PathVariable String userName, @RequestParam("position") int position) {
        User user = userService.getUserName(userName);
        DAOExampleObject daoExampleObject = userService.getAttackFromDao();
        List<SlotInfo> slots = new ArrayList<SlotInfo>();
        for (int i = 0; i < 7; i++) {
            SlotInfo s = new SlotInfo();
            s.setSlotNumber(i);
            s.setCreature(userService.getCreaturesByUserId(userName).get(i));
            slots.add(s);
        }
        model.addAttribute("slots", slots);
        userService.addCreature(position, userName);
        //userService.addValueToDao();
        model.addAttribute("creatures", userService.getCreaturesByUserId(userName).values());
        model.addAttribute("user", user);
        model.addAttribute("DAOExampleObject", daoExampleObject.getAttack());
        return "User";
    }

    @RequestMapping(value = "/user/{userName}", method = RequestMethod.DELETE)
    public String removeCreature(Model model, @PathVariable String userName, @RequestParam("removePosition") int removalPosition) {
        User user = userService.getUserName(userName);
        userService.removeCreature(removalPosition);
        model.addAttribute("creatures", userService.getCreaturesByUserId(userName).values());
        model.addAttribute("user", user);
        return "User";
    }
}