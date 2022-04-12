package web.service;

import org.springframework.stereotype.Service;
import web.DAO.UserDAO;
import web.model.User;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    @Override
    public void updateUser(int id, User user) {
        userDAO.updateUser(id, user);
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteById(id);
    }

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }
}
