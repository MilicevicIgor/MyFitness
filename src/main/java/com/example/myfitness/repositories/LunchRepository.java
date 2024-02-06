package com.example.myfitness.repositories;

import com.example.myfitness.models.Lunch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LunchRepository extends JpaRepository<Lunch, Long> {

}
