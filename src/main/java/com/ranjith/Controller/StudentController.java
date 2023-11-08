package com.ranjith.Controller;

import com.ranjith.Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/student")
public class StudentController {

    @RequestMapping("/form")
    public String showForm(Model model) {
        Student student = new Student();

        model.addAttribute("student", student);
        return "showStudentForm";

    }


}

