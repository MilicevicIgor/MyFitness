package com.example.myfitness.controllers;


import com.example.myfitness.models.Membership;
import com.example.myfitness.services.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;
import java.util.Optional;
@Controller
public class MembershipController {

    @Autowired
    private MembershipService membershipService;

    @GetMapping("/membership")
    public String showMembershipPage(Model model) {
        List<Membership> memberships = membershipService.getAllMemberships();
        model.addAttribute("memberships", memberships);
        return "Student/membership";
    }

    @GetMapping("/users/edit/membership/{studentId}")
    public String editMembershipPage(@PathVariable("studentId") Long studentId, Model model) {
        Optional<Membership> memberships = membershipService.getMembershipsById(studentId);
        model.addAttribute("memberships", memberships.orElse(null));
        return "users/membership";
    }

    @PostMapping("/membership")
    public String addMembership(@ModelAttribute Membership membership) {
        membershipService.addMembership(membership);
        return "redirect:/user/membership";
    }

    @PostMapping("/membership/{id}")
    public String deleteMembership(@PathVariable("id") Long id) {
        membershipService.deleteMembership(id);
        return "redirect:/user/membership";
    }

}
