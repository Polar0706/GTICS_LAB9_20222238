package com.tele.lab9_20222238.dto;

public class Meal {
    private String idMeal;
    private String strMeal;
    private String strCategory;
    private String strMealThumb;
    private String strArea;
    private String strTags;
    private String strInstructions;
    // Puedes agregar más campos según lo que necesites mostrar

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
