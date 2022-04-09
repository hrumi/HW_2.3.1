package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.DAO.UserDAO;
import web.model.User;

import java.util.List;

@Component
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
    public void updateUser(int id, String name, int age) {
        userDAO.updateById(id, name, age);
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteById(id);
    }
}