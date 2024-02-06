package com.example.myfitness.services;

import com.example.myfitness.models.Membership;
import com.example.myfitness.repositories.MembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MembershipService {

    @Autowired
    private MembershipRepository membershipRepository;

    public List<Membership> getAllMemberships() {
        return membershipRepository.findAll();
    }
    public Optional<Membership> getMembershipsById(Long studentId) {
        return membershipRepository.findById(studentId);
    }


    public void addMembership(Membership membership) {
        membershipRepository.save(membership);
    }

    public void deleteMembership(Long id) {
        membershipRepository.deleteById(id);
    }
}


