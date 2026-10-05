package com.example.demo;

public class Recipe {
    private Long id;
    private String title;
    private int durationMinutes;
    private String category;

    // Leerer Standard-Konstruktor
    public Recipe() {
    }

    // Konstruktor mit allen Feldern
    public Recipe(Long id, String title, int durationMinutes, String category) {
        this.id = id;
        this.title = title;
        this.durationMinutes = durationMinutes;
        this.category = category;
    }

    // Getter und Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}