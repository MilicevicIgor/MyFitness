package com.example.myfitness.repositories;

import com.example.myfitness.models.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepository extends JpaRepository<Membership,Long> {

}
