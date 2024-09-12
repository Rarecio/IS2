package ru.sala.is2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sala.is2.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating, Integer> {
}