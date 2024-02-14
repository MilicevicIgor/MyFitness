package com.example.myfitness.controllers;

import com.example.myfitness.models.Membership;
import com.example.myfitness.models.UserDetails;
import com.example.myfitness.services.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.security.core.Authentication;
import java.util.List;

@Controller
public class MembershipController {

    @Autowired
    private MembershipService membershipService;

    @GetMapping("/membership")
    public String showMembershipPage(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        List<Membership> memberships = membershipService.getMembershipsByUserId(userDetails.getUser().getId());
        model.addAttribute("memberships", memberships);
        return "Student/membership";
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