package com.tele.lab9_20222238.service;

import com.tele.lab9_20222238.dto.MealResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MealService {
    private final String MEAL_API_URL = "https://www.themealdb.com/api/json/v1/1/search.php?s=";

    public MealResponse searchMeals(String name) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(MEAL_API_URL + name, MealResponse.class);
    }
}
