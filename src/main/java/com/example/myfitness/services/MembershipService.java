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

    public List<Membership> getMembershipsByUserId(Long userId) {
        return membershipRepository.findByUserId(userId);
    }

    public void addMembership(Membership membership) {
        membershipRepository.save(membership);
    }

    public void deleteMembership(Long id) {
        membershipRepository.deleteById(id);
    }
}


