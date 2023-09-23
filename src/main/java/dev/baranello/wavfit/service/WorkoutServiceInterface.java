package dev.baranello.wavfit.service;

import dev.baranello.wavfit.model.Workout;

import java.util.List;
import java.util.Optional;

public interface WorkoutServiceInterface {

    public Workout saveWorkout(Workout workout);
    public Optional<Workout> getWorkoutById(Long workoutId);
    List<Workout> getAllWorkout();
    Workout updateWorkout(Long workoutId, Workout workout);
    void deleteWorkout(Long workoutId);

}
