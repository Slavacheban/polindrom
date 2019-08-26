package com.polindrom.demo.controller;

import com.polindrom.demo.controller.dto.PolindromData;
import com.polindrom.demo.service.PolindromDataService;
import com.polindrom.demo.transformer.PolindromDataTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/polindrom")
public class MainController {
    @Autowired
    private PolindromDataService service;
    @Autowired
    private PolindromDataTransformer transformer;

    @GetMapping
    public String getStartPage(@Valid Model model) {
        model.addAttribute("allPolindroms", transformer.buildPolindromDatas(service.findAll()));
        return "index";
    }
    @PostMapping
    public String getPolindroms(@ModelAttribute("polindromData") PolindromData polindromData) {
        service.savePolindromData(transformer.buildEntity(polindromData));
        return "redirect:/index";
    }

    @ExceptionHandler(Exception.class)
    public String getErrPage() {
        return "error";
    }

}
