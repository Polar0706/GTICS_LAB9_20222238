package com.tele.lab9_20222238.controller;

import com.tele.lab9_20222238.entity.FavoriteMeal;
import com.tele.lab9_20222238.service.FavoriteMealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ListFavoritesController {
    @Autowired
    private FavoriteMealService favoriteMealService;

    @GetMapping("/favorites")
    public String listFavorites(Model model) {
        List<FavoriteMeal> favorites = favoriteMealService.findAll();
        model.addAttribute("favorites", favorites);
        return "favorites";
    }
}
