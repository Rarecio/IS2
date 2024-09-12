package ru.sala.is2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sala.is2.entity.Indicator;

public interface IndicatorRepository extends JpaRepository<Indicator, Integer> {
}