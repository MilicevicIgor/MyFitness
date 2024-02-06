package com.example.myfitness.controllers;

import org.springframework.security.core.Authentication;
import com.example.myfitness.models.Membership;
import com.example.myfitness.models.User;
import com.example.myfitness.models.UserDetails;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
@PreAuthorize("hasAuthority('STUDENT')")
public class StudentController {

    @GetMapping
    public String studentDashboard(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) auth.getPrincipal();
        User currentUser = userDetails.getUser();
        Membership membership = new Membership();
        membership.setStudent(currentUser);
        model.addAttribute(membership);

        return "Student/dashboard";
    }


}
