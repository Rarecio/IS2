package ru.sala.is2.service;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sala.is2.entity.Indicator;
import ru.sala.is2.entity.University;
import ru.sala.is2.repository.IndicatorRepository;
import ru.sala.is2.repository.UniversityRepository;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UniversityService {

    private final UniversityRepository universityRepository;

    private final IndicatorRepository indicatorRepository;

    public void createNewUniversity(String universityName) { // Значения показателей ещё надо
        University university = new University(universityName);
        universityRepository.save(university);
    }

    public void addIndicator(String universityName, String indicatorName, String indicatorValue) {
        indicatorRepository.save(new Indicator(indicatorName, indicatorValue));
        University university = universityRepository.findByName(universityName);
        if (university == null) {
            throw new EntityNotFoundException("university: "+universityName + " not found");
        }

    }
}
