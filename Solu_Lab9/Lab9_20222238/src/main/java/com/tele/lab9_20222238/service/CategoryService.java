package com.tele.lab9_20222238.service;

import com.tele.lab9_20222238.dto.CategoryResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CategoryService {
    private final String CATEGORY_API_URL = "https://www.themealdb.com/api/json/v1/1/categories.php";

    public CategoryResponse getCategories() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(CATEGORY_API_URL, CategoryResponse.class);
    }
}
