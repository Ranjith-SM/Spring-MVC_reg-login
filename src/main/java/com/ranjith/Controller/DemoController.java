package com.ranjith.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/demo")
@Controller
public class DemoController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "showForm";
    }
}
