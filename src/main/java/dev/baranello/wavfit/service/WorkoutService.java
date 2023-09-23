package dev.baranello.wavfit.service;

import dev.baranello.wavfit.model.Workout;
import dev.baranello.wavfit.repository.WorkoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepository;

    public List<Workout> getAllWorkouts() {
        return workoutRepository.findAll();
    }

    public Optional<Workout> getWorkoutById(Long workoutId) {
        return workoutRepository.findById(workoutId);
    }

    public Workout createWorkout(Workout workout) {
        return workoutRepository.save(workout);
    }

    public Workout updateWorkout(Long workoutId, Workout updatedWorkout) {
        Optional<Workout> existingWorkoutOptional = workoutRepository.findById(workoutId);
        if (existingWorkoutOptional.isPresent()) {
            Workout existingWorkout = existingWorkoutOptional.get();
            existingWorkout.setWorkoutName(updatedWorkout.getWorkoutName());
            existingWorkout.setDate(updatedWorkout.getDate());
            existingWorkout.setExercises(updatedWorkout.getExercises());

            return workoutRepository.save(existingWorkout);
        } else {
            // Handle the case where the workout with the given ID doesn't exist.
            return null;
        }
    }

    public void deleteWorkout(Long workoutId) {
        workoutRepository.deleteById(workoutId);
    }
}
