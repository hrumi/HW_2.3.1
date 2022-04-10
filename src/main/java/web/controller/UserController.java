package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
;
import web.model.User;
import web.service.UserServiceImpl;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserServiceImpl userService;
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping() //для получение view со списком users
    public String getAll(Model model) {
        model.addAttribute("usersList", userService.getAllUsers());
        return "index";
    }

    @GetMapping("/new") //получение view для создания нового user
    public String newUser(@ModelAttribute("user") User user) {
        return "new";
    }

    @GetMapping("/{id}/edit")
    public String editUser(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "edit";
    }

    @PostMapping() //ловим ПОСТ запрос из view new
    public String addNewUser(@ModelAttribute("user") User user) {
        userService.addUser(user);
        return "redirect:/users";
    }

//    @PostMapping("/edit")  //отправка данных страницы изменения в БД
//    public String controllerEditUser(@ModelAttribute("user") User user) {
//        userService.updateUser(user);
//        return "redirect:/users";
//    }

    @PatchMapping ("/{id}")  //отправка данных страницы изменения в БД
    public String EditUser(@ModelAttribute("user") User user, @PathVariable("id") int id) {
        userService.updateUser(id, user);
        return "redirect:/users";
    }




//    @PostMapping()
//    public String controllerAddUser1(@RequestParam("name") String name,
//                                     @RequestParam("age") int age,
//                                     Model model) {
//        User user = new User();
//        user.setAge(age);
//        user.setName(name);
//        userService.addUser(user);
//        model.addAttribute("user", user);
//        return  "redirect:/users";
//    }



//    @PatchMapping("/{id}")
//    public String update(@ModelAttribute("user") User user, @PathVariable("id") int id) {
//
//    }


}
