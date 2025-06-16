package com.tele.lab9_20222238.service;

import com.tele.lab9_20222238.entity.FavoriteMeal;
import com.tele.lab9_20222238.repository.FavoriteMealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FavoriteMealService {
    @Autowired
    private FavoriteMealRepository favoriteMealRepository;

    public void save(FavoriteMeal favoriteMeal) {
        favoriteMealRepository.save(favoriteMeal);
    }

    public boolean existsById(String idMeal) {
        return favoriteMealRepository.existsById(idMeal);
    }

    public Optional<FavoriteMeal> findById(String idMeal) {
        return favoriteMealRepository.findById(idMeal);
    }
}
