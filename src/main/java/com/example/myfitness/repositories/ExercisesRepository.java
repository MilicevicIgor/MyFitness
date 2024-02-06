package com.example.myfitness.repositories;

import com.example.myfitness.models.Exercises;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExercisesRepository extends JpaRepository<Exercises,Long> {

}
