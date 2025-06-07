package com.example.springmedicaldeclaration.controller;

import com.example.springmedicaldeclaration.model.*;
import com.example.springmedicaldeclaration.service.HealthDeclarationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/home")
public class medicalController {
    private static HealthDeclarationService healthDeclarationService = new HealthDeclarationService();
    @GetMapping("")
    public String showList(Model model) {
        List<Health_declaration> healthDeclarations = healthDeclarationService.findAll();
        model.addAttribute("declarations", healthDeclarations);
        return "/list";
    }

    @GetMapping("/insert")
    public String insertFrom(Model model) {
        Health_declaration declarationList = new Health_declaration();
        declarationList.setUser(new User());
        declarationList.setVehicle(new Vehicle());
        declarationList.setAddress(new Address());
        declarationList.setSicksInfection(new Sicks_Infection());
        model.addAttribute("declaration", declarationList);
        return "/index";
    }

    @PostMapping("/save") 
    public String save(@ModelAttribute("declaration") Health_declaration declaration) {
        healthDeclarationService.insertFrom(declaration);
        return "redirect:/home";
    }
}
