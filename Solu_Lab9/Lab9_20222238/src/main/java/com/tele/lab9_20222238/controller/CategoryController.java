package com.tele.lab9_20222238.controller;

import com.tele.lab9_20222238.dto.CategoryResponse;
import com.tele.lab9_20222238.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/categories")
    public String listCategories(@RequestParam(value = "search", required = false) String search, Model model) {
        CategoryResponse response = categoryService.getCategories();
        model.addAttribute("categories", response.getCategories());
        model.addAttribute("search", search);
        return "categories";
    }
}
