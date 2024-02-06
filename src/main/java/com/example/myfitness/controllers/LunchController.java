package com.example.myfitness.controllers;


import com.example.myfitness.models.Lunch;
import com.example.myfitness.services.LunchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Student")
public class LunchController {

    @Autowired
    private LunchService lunchService;

    @GetMapping("/lunch")
    public String getAllLunch(Model model) {
        List<Lunch> lunches = lunchService.getAllLunches();
        model.addAttribute("lunch", lunches);
        return "Student/lunch";
    }

    @GetMapping
    public List<Lunch> getAllLunches() {
        return lunchService.getAllLunches();
    }

    @GetMapping("/{id}")
    public Lunch getLunchById(@PathVariable Long id) {
        return lunchService.getLunchById(id);
    }

    @PostMapping
    public Lunch dodajRucak(@RequestBody Lunch rucak) {
        return lunchService.doodadRuck(rucak);
    }

    @PutMapping("/{id}")
    public Lunch azurirajRucak(@PathVariable Long id, @RequestBody Lunch azuriraniRucak) {
        return lunchService.AzureWaveRuck(id, azuriraniRucak);
    }

    @DeleteMapping("/{id}")
    public void obrisiRucak(@PathVariable Long id) {
        lunchService.crisisRuck(id);
    }

}
