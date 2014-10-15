package lv.ressel.testapp.controllers;


import lv.ressel.testapp.domain.User;
import lv.ressel.testapp.services.UMPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikolay.ressel on 08.10.2014.
 */

@Controller
public class UserMainPageController {

    @Autowired
    private UMPService umpService;

    @RequestMapping(value = "/ump/{userName}")
    public ModelAndView getUserMainPage(@PathVariable String userName) {
        User user = umpService.getUserByName(userName);
       /* if (userName == null) {
            return "404";
   r     }*/
        List<String> list = getList();
        ModelAndView model = new ModelAndView("UMP");
        model.addObject("username", user.getName());
        model.addObject("lists", list);
        return model;
    }
    private List<String> getList() {

        List<String> list = new ArrayList<String>();
        list.add("FrostWolf ");
        list.add("WinterRider ");
        list.add("Enchanter ");
        return list;
    }
}