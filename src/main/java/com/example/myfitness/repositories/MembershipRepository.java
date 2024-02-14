package com.example.myfitness.repositories;

import com.example.myfitness.models.Membership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface MembershipRepository extends JpaRepository<Membership,Long> {
    @Query("SELECT m FROM Membership m WHERE m.id_usera = :userId")
    List<Membership> findByUserId(@Param("userId") Long userId);
}
