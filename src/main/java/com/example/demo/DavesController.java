package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class DavesController {

    @Autowired
    DavesRepository davesRepository;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("list", davesRepository.findAll());
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/loggedin")
    public String logggedin(Model model) {
        model.addAttribute("listing", new Listing());
        model.addAttribute("list", davesRepository.findAll());
        return "editor";
    }

    @PostMapping("/addRow")
    public String post(@Valid Listing listing, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "editor";
        }
        davesRepository.save(listing);
        model.addAttribute("listing", new Listing());
        model.addAttribute("list", davesRepository.findAll());
        return "editor";
    }

    @RequestMapping("/detail/{id}")
    public String details(@PathVariable("id") Integer id, Model model) {

        model.addAttribute("listing", davesRepository.findOne(id));

        return "details";
    }

}
