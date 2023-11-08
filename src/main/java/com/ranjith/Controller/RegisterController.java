package com.ranjith.Controller;

import com.ranjith.Dao.UserDao;
import com.ranjith.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


@Controller
public class RegisterController {

    UserDao userDao;

    public RegisterController() {
        userDao = new UserDao();
    }

    @RequestMapping("/register")
    public String showForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);

        return "register";
    }

    @RequestMapping(value = "/registerForm", method = RequestMethod.POST)
    public String processStudentForm(HttpServletRequest req, @ModelAttribute("user") User user) {
//        String email = req.getParameter("email");
//        String pwd = req.getParameter("pwd");
//        String fname = req.getParameter("firstName");
//        String lname = req.getParameter("lastName");
//        String country = req.getParameter("country");
//        String state = req.getParameter("state");
//        String language = req.getParameter("favoriteLanguage");
//        String os = req.getParameter("operatingSystem");

//        UserDao.AddUser(email, pwd, fname, lname, country, state, language, os);

        userDao.addUser(user);


        return "login";
    }

}
