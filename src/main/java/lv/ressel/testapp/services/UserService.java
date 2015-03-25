package lv.ressel.testapp.services;

import lv.ressel.testapp.DAO.InputValueDAO;
import lv.ressel.testapp.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.swing.text.Position;
import java.util.*;

/**
 * Возвращает героя с набором существ
 */
@Service
public class UserService {

    @Autowired
    InputValueDAO inputValueDAO;

    private Map<String, Map<Integer, Creature>> creaturesByUser;
    private HashMap<Integer, Creature> creatureSet;

    @PostConstruct
    public void init() {
        creaturesByUser = new HashMap<String, Map<Integer, Creature>>();
        creatureSet = new HashMap<Integer, Creature>();
    }

    public User getUserName(String userName) {
        creaturesByUser.put(userName, getCreaturesByUserId(userName));
        if (creaturesByUser.containsKey(userName)) {
            User user = new User();
            user.setName(userName);
            return user;
        }
        return null;
    }

    public Map<Integer, Creature> getCreaturesByUserId(String userName) {
        if (userName!=null) {
            creaturesByUser.put(userName,creatureSet);
            creatureSet.put(1,new Enchanter());
            return creatureSet;
        }
        return Collections.emptyMap();
    }

    public void addCreature(int position,String userName) {
        inputValueDAO.addValue();
        creatureSet.put(position, new Enchanter());
    }

    public void removeCreature(int position) {
        creatureSet.remove(position);
    }
}



