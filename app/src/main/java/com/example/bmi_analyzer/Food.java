package com.example.bmi_analyzer;

public class Food {

    int image;
    String name;
    String category;
    int calory;
    public Food(int image, String name, String category, int calory) {
        this.image = image;
        this.name = name;
        this.category = category;
        this.calory = calory;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCalory() {
        return calory;
    }

    public void setCalory(int calory) {
        this.calory = calory;
    }
}
