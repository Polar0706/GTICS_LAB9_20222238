package com.tele.lab9_20222238.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "favorite_meal")
public class FavoriteMeal {
    @Id
    private String idMeal;
    private String strMeal;
    private String strCategory;
    private String strMealThumb;
    private String strArea;
    private String strTags;
    private String strInstructions;

    // Getters y setters
    public String getIdMeal() { return idMeal; }
    public void setIdMeal(String idMeal) { this.idMeal = idMeal; }
    public String getStrMeal() { return strMeal; }
    public void setStrMeal(String strMeal) { this.strMeal = strMeal; }
    public String getStrCategory() { return strCategory; }
    public void setStrCategory(String strCategory) { this.strCategory = strCategory; }
    public String getStrMealThumb() { return strMealThumb; }
    public void setStrMealThumb(String strMealThumb) { this.strMealThumb = strMealThumb; }
    public String getStrArea() { return strArea; }
    public void setStrArea(String strArea) { this.strArea = strArea; }
    public String getStrTags() { return strTags; }
    public void setStrTags(String strTags) { this.strTags = strTags; }
    public String getStrInstructions() { return strInstructions; }
    public void setStrInstructions(String strInstructions) { this.strInstructions = strInstructions; }
}
