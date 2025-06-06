package com.example.springmedicaldeclaration.controller;

import com.example.springmedicaldeclaration.model.*;
import com.example.springmedicaldeclaration.service.HealthDeclarationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class medicalController {
    private static HealthDeclarationService healthDeclarationService = new HealthDeclarationService();
    @GetMapping("/list")
    public String showList(Model model) {
        List<Health_declaration> healthDeclarations = healthDeclarationService.findAll();
        model.addAttribute("", healthDeclarations);
        return "/list";
    }

    @GetMapping("/insert")
    public String insertFrom(Model model) {
        Health_declaration healthDeclaration = new Health_declaration();
        healthDeclaration.setUser(new User());
        healthDeclaration.setVehicle(new Vehicle());
        healthDeclaration.setAddress(new Address());
        healthDeclaration.setSicksInfection(new Sicks_Infection());
        model.addAttribute("HeathDeclaration", healthDeclaration);
        return "/index";
    }

    @PostMapping("/insert/save")
    public String save(@ModelAttribute("HeathDeclaration") Health_declaration declaration, Model model) {
        healthDeclarationService.insertFrom(declaration);
        model.addAttribute("message", "Gui thanh cong");
        return "redirect:/list";
    }
}
