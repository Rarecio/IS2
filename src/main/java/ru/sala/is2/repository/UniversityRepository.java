package ru.sala.is2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sala.is2.entity.University;

import java.util.Optional;

public interface UniversityRepository extends JpaRepository<University, Integer> {
    Optional<University> findByName(String name);
}