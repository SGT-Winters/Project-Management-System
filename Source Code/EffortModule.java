package com.project;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages effort tracking for various tasks within the project.
 */
public class EffortModule {

    private List<Effort> efforts;

    // Constructor
    public EffortModule() {
        this.efforts = new ArrayList<>();
    }

    // Log Effort
    public void logEffort(String taskType, int hoursSpent, String description) {
        Effort effort = new Effort(taskType, hoursSpent, description);
        efforts.add(effort);
        System.out.println("Effort logged: " + effort);
    }

    // Update Effort
    public void updateEffort(int id, String newTaskType, int newHoursSpent, String newDescription) {
        Effort effort = findEffortById(id);
        if (effort != null) {
            effort.setTaskType(newTaskType);
            effort.setHoursSpent(newHoursSpent);
            effort.setDescription(newDescription);
            System.out.println("Effort updated: " + effort);
        } else {
            System.out.println("Effort with ID " + id + " not found.");
        }
    }

    // Delete Effort
    public void delEffort(int id) {
        Effort effort = findEffortById(id);
        if (effort != null) {
            efforts.remove(effort);
            System.out.println("Effort deleted: " + effort);
        } else {
            System.out.println("Effort with ID " + id + " not found.");
        }
    }

    // Get Effort
    public void getEffort() {
        if (efforts.isEmpty()) {
            System.out.println("No efforts logged.");
        } else {
            System.out.println("Logged Efforts:");
            for (Effort effort : efforts) {
                System.out.println(effort);
            }
        }
    }

    // Helper: Find Effort by ID
    private Effort findEffortById(int id) {
        for (Effort effort : efforts) {
            if (effort.getId() == id) {
                return effort;
            }
        }
        return null;
    }
}
