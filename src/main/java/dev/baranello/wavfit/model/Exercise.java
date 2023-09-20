package dev.baranello.wavfit.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Data
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long exerciseId;
    private String exerciseName;
    private int sets;
    private int reps;
    private int weightLbs;
    private String muscleGroup;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne
    private Workout workout;
}