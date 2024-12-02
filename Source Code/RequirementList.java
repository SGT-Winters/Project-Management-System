package com.project;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages functional and non-functional requirements for a project.
 */
public class RequirementList {

    private List<Requirement> requirements;

    // Constructor
    public RequirementList() {
        this.requirements = new ArrayList<>();
    }

    // Add Functional Requirement
    public void addFuncReq(String description) {
        Requirement requirement = new Requirement(description, "Functional");
        requirements.add(requirement);
        System.out.println("Functional requirement added: " + description);
    }

    // Add Non-Functional Requirement
    public void addNFuncReq(String description) {
        Requirement requirement = new Requirement(description, "Non-Functional");
        requirements.add(requirement);
        System.out.println("Non-Functional requirement added: " + description);
    }

    // Update Requirement
    public void updateReq(int id, String newDescription) {
        Requirement req = findRequirementById(id);
        if (req != null) {
            req.setDescription(newDescription);
            System.out.println("Requirement updated: " + req);
        } else {
            System.out.println("Requirement with ID " + id + " not found.");
        }
    }

    // Delete Requirement
    public void delReq(int id) {
        Requirement req = findRequirementById(id);
        if (req != null) {
            requirements.remove(req);
            System.out.println("Requirement deleted: " + req);
        } else {
            System.out.println("Requirement with ID " + id + " not found.");
        }
    }

    // List All Requirements
    public void listReq() {
        if (requirements.isEmpty()) {
            System.out.println("No requirements found.");
        } else {
            System.out.println("Requirements:");
            for (Requirement req : requirements) {
                System.out.println(req);
            }
        }
    }

    // View Requirement Details
    public void viewReq(int id) {
        Requirement req = findRequirementById(id);
        if (req != null) {
            System.out.println("Requirement Details: " + req);
        } else {
            System.out.println("Requirement with ID " + id + " not found.");
        }
    }

    // Helper: Find Requirement by ID
    private Requirement findRequirementById(int id) {
        for (Requirement req : requirements) {
            if (req.getId() == id) {
                return req;
            }
        }
        return null;
    }
}
