package com.ranjith.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


@Controller
public class HomeController extends HttpServlet {
    @RequestMapping("/")
    public String showPage() {
        return "index";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "processForm";
    }

    @RequestMapping("/showForm")
    public String showForm() {
        return "showForm";
    }

    @RequestMapping("/processForm1")
    public String processForm1(HttpServletRequest request, Model model) {
        String name = request.getParameter("sname").toUpperCase();
        model.addAttribute("StudentName", name);
        return "processForm";
    }

    @RequestMapping("/processForm2")
    public String processForm2(@RequestParam("sname") String name , Model model) {

        model.addAttribute("StudentName", name);
        return "../processForm";
    }

}
