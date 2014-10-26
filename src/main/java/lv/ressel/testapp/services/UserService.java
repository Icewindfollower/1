package lv.ressel.testapp.services;

import lv.ressel.testapp.domain.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *  Возвращает героя с набором существ
 */
@Service
public class UserService {
    public User getUserName(String UserName) {
        if (UserName.contains("1")) {
            User user = new User();
            user.setName("Аэр, длань Севера");
            return user;
        }
        return null;
    }

    public List<Creature> getCreaturesByUserId(String userName) {
        if (userName.equals("1")) {
            List<Creature> result = new ArrayList<Creature>();
            result.add(new Enchanter());
            result.add(new WinterRider());
            result.add(new FrostWolf());
            return result;
        }
        return new ArrayList<Creature>();
    }
}
