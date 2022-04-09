package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User getUserById(int id);
    public void updateUser(int id, String name, int age);
    public void deleteUser(int id);
}
