package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import web.DAO.UserDAO;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserDAO userDAO;

    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }


    @GetMapping()
    public String controllerGetAll(Model model) {
        model.addAttribute("usersList", userDAO.getAllUsers());
        return "index1";
    }

    @GetMapping("/{id}")
    public String controllerGetById(@PathVariable("id") int id, Model model) {
        model.addAttribute("userById", userDAO.getUserById(id));
        return "user1";
    }


}
