package com.green.pojo;

public class Ingredient {
    private Integer id;

    private String ingredientId;

    private String ingredientName;

    private String ingredientContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(String ingredientId) {
        this.ingredientId = ingredientId == null ? null : ingredientId.trim();
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName == null ? null : ingredientName.trim();
    }

    public String getIngredientContent() {
        return ingredientContent;
    }

    public void setIngredientContent(String ingredientContent) {
        this.ingredientContent = ingredientContent == null ? null : ingredientContent.trim();
    }
}