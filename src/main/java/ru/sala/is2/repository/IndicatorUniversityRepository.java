package ru.sala.is2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sala.is2.entity.IndicatorUniversity;

public interface IndicatorUniversityRepository extends JpaRepository<IndicatorUniversity, Integer> {
}