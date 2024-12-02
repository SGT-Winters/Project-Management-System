package com.project;

/**
 * Represents a single effort log in the project.
 */
public class Effort {

    private static int counter = 0; // To auto-generate unique IDs
    private int id;
    private String taskType; // e.g., "Requirements Analysis", "Coding"
    private int hoursSpent;
    private String description;

    // Constructor
    public Effort(String taskType, int hoursSpent, String description) {
        this.id = ++counter;
        this.taskType = taskType;
        this.hoursSpent = hoursSpent;
        this.description = description;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public int getHoursSpent() {
        return hoursSpent;
    }

    public void setHoursSpent(int hoursSpent) {
        this.hoursSpent = hoursSpent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Effort{" +
                "ID=" + id +
                ", TaskType='" + taskType + '\'' +
                ", HoursSpent=" + hoursSpent +
                ", Description='" + description + '\'' +
                '}';
    }
}
