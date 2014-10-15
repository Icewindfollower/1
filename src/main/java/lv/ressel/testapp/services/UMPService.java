package lv.ressel.testapp.services;

import lv.ressel.testapp.domain.User;
import org.springframework.stereotype.Service;

/**
 * Created by nikolay.ressel on 08.10.2014.
 */
@Service
public class UMPService {
    public User getUserByName(String UserName) {
        if (UserName.contains("1")) {
            User user = new User();
            user.setName("Аэр, длань Севера");
            return user;
        }
        return null;
    }
}
