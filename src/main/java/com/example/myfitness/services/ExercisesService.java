package com.example.myfitness.services;

import com.example.myfitness.models.Exercises;
import com.example.myfitness.models.Membership;
import com.example.myfitness.repositories.ExercisesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExercisesService {

    @Autowired
    private ExercisesRepository exercisesRepository;

    @Autowired
    public ExercisesService(ExercisesRepository exercisesRepository) {
        this.exercisesRepository = exercisesRepository;
    }

    public List<Exercises> getExerciseByUserId(Long userId) {
        return exercisesRepository.findByUserId(userId);
    }

    public Exercises getExerciseById(Long id) {
        return exercisesRepository.getReferenceById(id);
    }

    public Exercises saveExercise(Exercises exercises) {
        return exercisesRepository.save(exercises);
    }

    public void deleteExerciseById(Long id) {
        exercisesRepository.deleteById(id);
    }



}
