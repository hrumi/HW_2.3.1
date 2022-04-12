package web.DAO;

import org.springframework.stereotype.Component;
import web.model.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class UserDAO {

    @PersistenceContext
    private  EntityManager entityManager;

    public List<User> getAllUsers() { //зачем-то подчеркивает User
        return entityManager.createQuery("select u from User u", User.class).getResultList();

    }

    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }

    public void updateUser(int id, User user) {
        User updateUser = getUserById(id);
        updateUser.setName(user.getName());
        updateUser.setAge(user.getAge());
    }

    public void deleteById(int id) {
        entityManager.remove(getUserById(id));
    }

    public void addUser(User user) {
        entityManager.persist(user);
    }

}


