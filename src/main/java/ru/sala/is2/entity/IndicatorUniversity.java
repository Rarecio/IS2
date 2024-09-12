package ru.sala.is2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "indicator_university")
public class IndicatorUniversity {

    @EmbeddedId
    private IndicatorUniversityPK id;

    @Column(name = "value", nullable = false)
    private Integer value;

    @Column(name = "year", nullable = false)
    private Integer year;

}