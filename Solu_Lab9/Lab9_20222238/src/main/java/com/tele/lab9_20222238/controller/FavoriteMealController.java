package com.tele.lab9_20222238.controller;

import com.tele.lab9_20222238.dto.Meal;
import com.tele.lab9_20222238.entity.FavoriteMeal;
import com.tele.lab9_20222238.service.FavoriteMealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FavoriteMealController {
    @Autowired
    private FavoriteMealService favoriteMealService;

    @PostMapping("/favorite/add")
    public String addFavorite(@ModelAttribute Meal meal, Model model) {
        if (!favoriteMealService.existsById(meal.getIdMeal())) {
            FavoriteMeal favorite = new FavoriteMeal();
            favorite.setIdMeal(meal.getIdMeal());
            favorite.setStrMeal(meal.getStrMeal());
            favorite.setStrCategory(meal.getStrCategory());
            favorite.setStrMealThumb(meal.getStrMealThumb());
            favorite.setStrArea(meal.getStrArea());
            favorite.setStrTags(meal.getStrTags());
            favorite.setStrInstructions(meal.getStrInstructions());
            favoriteMealService.save(favorite);
            model.addAttribute("success", true);
        } else {
            model.addAttribute("success", false);
        }
        model.addAttribute("meal", meal);
        return "redirect:/meals/detail/" + meal.getIdMeal() + "?added=true";
    }
}
