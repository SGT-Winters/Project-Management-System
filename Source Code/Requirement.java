package com.project;

/**
 * Represents a single requirement in the project.
 */
public class Requirement {

    private static int counter = 0; // To auto-generate unique IDs
    private int id;
    private String description;
    private String type; // Functional or Non-Functional

    // Constructor
    public Requirement(String description, String type) {
        this.id = ++counter;
        this.description = description;
        this.type = type;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Override toString for better readability
    @Override
    public String toString() {
        return "Requirement{" +
                "ID=" + id +
                ", Description='" + description + '\'' +
                ", Type='" + type + '\'' +
                '}';
    }
}
