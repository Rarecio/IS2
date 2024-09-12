package ru.sala.is2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sala.is2.entity.University;

public interface UniversityRepository extends JpaRepository<University, Integer> {
    University findByName(String name);
}