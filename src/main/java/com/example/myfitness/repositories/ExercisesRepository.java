package com.example.myfitness.repositories;

import com.example.myfitness.models.Exercises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface ExercisesRepository extends JpaRepository<Exercises,Long> {
    @Query("SELECT m FROM Exercises m WHERE m.id_usera = :userId")
    List<Exercises> findByUserId(@Param("userId") Long userId);
}


