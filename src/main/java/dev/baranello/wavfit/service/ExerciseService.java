package dev.baranello.wavfit.service;

import dev.baranello.wavfit.model.Exercise;
import dev.baranello.wavfit.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    public List<Exercise> getAllExercises() {
        return exerciseRepository.findAll();
    }

    public Optional<Exercise> getExerciseById(Long exerciseId) {
        return exerciseRepository.findById(exerciseId);
    }

    public Exercise createExercise(Exercise exercise) {
        return exerciseRepository.save(exercise);
    }

    public Exercise updateExercise(Long exerciseId, Exercise updatedExercise) {
        Optional<Exercise> existingExerciseOptional = exerciseRepository.findById(exerciseId);
        if (existingExerciseOptional.isPresent()) {
            Exercise existingExercise = existingExerciseOptional.get();
            existingExercise.setExerciseName(updatedExercise.getExerciseName());
            existingExercise.setSets(updatedExercise.getSets());
            existingExercise.setReps(updatedExercise.getReps());
            existingExercise.setWeightLbs(updatedExercise.getWeightLbs());
            existingExercise.setMuscleGroup(updatedExercise.getMuscleGroup());

            return exerciseRepository.save(existingExercise);
        } else {
            // Handle the case where the exercise with the given ID doesn't exist.
            return null;
        }
    }

    public void deleteExercise(Long exerciseId) {
        exerciseRepository.deleteById(exerciseId);
    }
}
