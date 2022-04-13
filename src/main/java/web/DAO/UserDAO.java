package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();
    public User getUserById(int id);
    public void updateUser(int id, User user);
    public void deleteById(int id);
    public void addUser(User user);
}
