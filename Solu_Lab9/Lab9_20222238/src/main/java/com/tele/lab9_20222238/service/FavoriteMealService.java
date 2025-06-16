package com.example.service;

import com.example.model.FavoriteMeal;
import com.example.repository.FavoriteMealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteMealService {

    @Autowired
    private FavoriteMealRepository favoriteMealRepository;

    public List<FavoriteMeal> findAll() {
        return favoriteMealRepository.findAll();
    }
}