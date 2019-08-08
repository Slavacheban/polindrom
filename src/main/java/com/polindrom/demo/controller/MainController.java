package com.polindrom.demo.controller;

import com.polindrom.demo.controller.dto.PolindromData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/polindrom")
public class MainController {
    @GetMapping
    public String getStartPage() {
        return "index";
    }
    @PostMapping
    public String getPolindroms(@Valid Model model) {
        //model.addAttribute();
        return "index";
    }

}
