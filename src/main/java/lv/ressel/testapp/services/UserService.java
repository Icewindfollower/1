package lv.ressel.testapp.services;

import org.springframework.stereotype.Service;

import lv.ressel.testapp.domain.User;

/**
 *
 */
@Service
public class UserService {
    public User getUserById(Long userId) {
        if (userId == 1) {
            User user = new User();
            user.setName("Nikolay Ressel");
            return user;
        }
        return null;
    }
}
