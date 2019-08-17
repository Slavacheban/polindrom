package com.polindrom.demo.controller;

import com.polindrom.demo.controller.dto.PolindromData;
import com.polindrom.demo.service.PolindromDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/polindrom")
public class MainController {
    @Autowired
    private PolindromDataService service;

    @GetMapping
    public String getStartPage(Model model) {
        model.addAttribute("allPolindroms", service.findAll());
        return "index";
    }
    @PostMapping
    public String getPolindroms(@Valid Model model) {
        model.addAttribute("polindromData", new PolindromData());
        return "index";
    }

}
