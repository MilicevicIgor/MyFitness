package com.example.myfitness.repositories;

import com.example.myfitness.models.Lunch;
import com.example.myfitness.models.Membership;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LunchRepository extends JpaRepository<Lunch, Long> {
    @Query("SELECT m FROM Lunch m WHERE m.userId = :userId")
    List<Lunch> findByUserId(@Param("userId") Long userId);

}
