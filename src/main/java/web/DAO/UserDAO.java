package web.DAO;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDAO {

//    private List<User> users;
//    private static int count;

//    {
//        users = new ArrayList<>();
//        User user1 = new User();
//        user1.setId(++count);
//        user1.setName("Alex");
//        user1.setAge(31);
//        users.add(user1);
//
//        User user2 = new User();
//        user2.setId(++count);
//        user2.setName("Baby");
//        user2.setAge(32);
//        users.add(user2);
//
//        User user3 = new User();
//        user3.setId(++count);
//        user3.setName("Candy");
//        user3.setAge(33);
//        users.add(user3);
//
//    }

    public List<User> getAllUsers() {
//        return users;
    }

    public User getUserById(int id) {
//        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    public void updateUser(int id, User user) {
//        User toBeUpdated = users.get(id);
//        toBeUpdated.setName(user.getName());
//        toBeUpdated.setAge(user.getAge());
    }

    public void deleteById(int id) {
//        users.removeIf(user -> user.getId() == id);
    }


    public void addUser(User user) {
//        user.setId(++count);
//        users.add(user);
    }

}


