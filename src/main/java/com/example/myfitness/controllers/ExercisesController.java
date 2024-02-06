package com.example.myfitness.controllers;

import com.example.myfitness.models.Exercises;
import com.example.myfitness.services.ExercisesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ExercisesController {

    @Autowired
    private final ExercisesService exercisesService;


    public ExercisesController(ExercisesService exercisesService) {
        this.exercisesService = exercisesService;
    }


    @GetMapping("/exercises")
    public String getAllExercises(Model model) {
        List<Exercises> exercises = exercisesService.getAllExercises();
        model.addAttribute("exercises", exercises);
        return "Student/exercises";
    }


    @GetMapping("/{id}")
    public Exercises getExerciseById(@PathVariable Long id) {
        return exercisesService.getExerciseById(id);
    }

    @PostMapping
    public Exercises saveExercise(@RequestBody Exercises exercises) {
        return exercisesService.saveExercise(exercises);
    }

    @DeleteMapping("/{id}")
    public void deleteExerciseById(@PathVariable Long id) {
        exercisesService.deleteExerciseById(id);
    }
}
