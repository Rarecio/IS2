package ru.sala.is2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "university")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "university_id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, unique = true, length = Integer.MAX_VALUE)
    private String name;

    @OneToMany(mappedBy = "university")
    private Set<Rating> ratings = new LinkedHashSet<>();



    public University(String name) {
        this.name = name;
    }
}