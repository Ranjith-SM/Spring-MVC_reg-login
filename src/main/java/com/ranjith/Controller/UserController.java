package com.ranjith.Controller;

import com.ranjith.Dao.UserDao;
import com.ranjith.Model.User;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {

    UserDao userDao;

    public UserController() {
        userDao = new UserDao();
    }

    @RequestMapping("/login")
    public String showLogin(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "login";
    }

    @RequestMapping(value = "/loginForm", method = RequestMethod.POST)
    public String loginForm(@ModelAttribute("user") User user, Model model) {
        User loggedUser = UserDao.checkUser(user.getEmail(), user.getPwd());
        if (loggedUser != null) {
            List<User> users = UserDao.getAllUsers();
            model.addAttribute("users", users);
            return "showUsers";
        } else {
            return "register";
        }

    }

//    @RequestMapping("/getusers")
//    public String showUsers(Model model) {
//        List<User> users = UserDao.getAllUsers();
//        model.addAttribute("users", users);
//
//        for (User user : users) {
//            System.out.println(user.getFirstName());
//        }
//
//        return "showUsers";
//    }


}
