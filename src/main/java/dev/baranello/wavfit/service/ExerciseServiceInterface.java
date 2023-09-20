package dev.baranello.wavfit.service;

import dev.baranello.wavfit.model.Exercise;

import java.util.List;
import java.util.Optional;

public interface ExerciseServiceInterface {
    public Exercise saveWorkout(Exercise exercise);
    public Optional<Exercise> getExerciseById(Long id);
    List<Exercise> getAllExercise();
    Exercise updateExercise(Long id, Exercise exercise);
    void deleteExercise(Long id);
}
