package lv.ressel.testapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import lv.ressel.testapp.domain.User;
import lv.ressel.testapp.services.UserService;

/**
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{userName}")
    public String getMainPage(Model model, @PathVariable String userName) {
        User user = userService.getUserName(userName);
        if (user == null ) {
            return "404";
        }
        model.addAttribute("user", user);
        model.addAttribute("creatures", userService.getCreaturesByUserId(userName));
        return "User";
    }
}
