package com.tele.lab9_20222238.controller;

import com.tele.lab9_20222238.dto.MealResponse;
import com.tele.lab9_20222238.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MealController {
    @Autowired
    private MealService mealService;

    @GetMapping("/meals")
    public String searchMeals(@RequestParam(value = "search", required = false) String search, Model model) {
        MealResponse response = null;
        if (search != null && !search.isEmpty()) {
            response = mealService.searchMeals(search);
        }
        model.addAttribute("meals", response != null ? response.getMeals() : null);
        model.addAttribute("search", search);
        return "meals";
    }
}
