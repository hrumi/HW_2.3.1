package web.DAO;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {

    private List<User> users;
    private static int count;

    {
        users = new ArrayList<>();
        users.add(new User(++count, "Alex", 31));
        users.add(new User(++count, "Bred", 32));
        users.add(new User(++count, "Ceed", 33));
        users.add(new User(++count, "Dred", 34));
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserById(int id) {
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    public void updateById(int id, String name, int age) {

    }

    public void deleteById(int id) {

    }


}


