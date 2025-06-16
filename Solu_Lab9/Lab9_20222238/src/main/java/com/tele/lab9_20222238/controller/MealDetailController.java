package com.tele.lab9_20222238.controller;

import com.tele.lab9_20222238.dto.Meal;
import com.tele.lab9_20222238.dto.MealResponse;
import com.tele.lab9_20222238.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MealDetailController {
    @Autowired
    private MealService mealService;

    @GetMapping("/meals/detail/{idMeal}")
    public String mealDetail(@PathVariable String idMeal, Model model) {
        MealResponse response = mealService.searchMeals("");
        Meal meal = null;
        if (response != null && response.getMeals() != null) {
            meal = response.getMeals().stream()
                    .filter(m -> m.getIdMeal().equals(idMeal))
                    .findFirst().orElse(null);
        }
        model.addAttribute("meal", meal);
        return "meal_detail";
    }
}
