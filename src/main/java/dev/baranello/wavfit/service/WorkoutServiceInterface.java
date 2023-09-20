package dev.baranello.wavfit.service;

import dev.baranello.wavfit.model.Workout;

import java.util.List;
import java.util.Optional;

public interface WorkoutServiceInterface {

    public Workout saveWorkout(Workout workout);
    public Optional<Workout> getWorkoutById(Long id);
    List<Workout> getAllWorkout();
    Workout updateWorkout(Long id, Workout workout);
    void deleteWorkout(Long id);

}
