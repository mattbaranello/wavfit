package dev.baranello.wavfit.repository;

import dev.baranello.wavfit.model.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
}
