package ru.sala.is2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "indicator")
public class Indicator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, unique = true, length = Integer.MAX_VALUE)
    private String name;

    @Column(name = "unit_of_measure", nullable = false, length = Integer.MAX_VALUE)
    private String unitOfMeasure;

    public Indicator(String name, String unitOfMeasure) {
        this.name = name;
        this.unitOfMeasure = unitOfMeasure;
    }
}