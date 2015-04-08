package lv.ressel.testapp.controllers;

import javax.servlet.http.HttpSession;

import lv.ressel.testapp.domain.DAOExampleObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by nikolay.ressel on 08.04.2015.
 */
@Controller
public class JsonController {
    @RequestMapping(method = RequestMethod.GET, value = "/stats")
    public @ResponseBody
    DAOExampleObject getDAOPage() {
        DAOExampleObject result = new DAOExampleObject();
        result.setDefense(10);
        result.setAttack(3);
        return result;
    }
}
