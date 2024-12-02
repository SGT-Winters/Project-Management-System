package com.project;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the general information of a project, including details and risks.
 */
public class Project {

    private String projectName;
    private String projectDescription;
    private String projectOwner;
    private List<String> teamMembers;
    private List<Risk> risks;

    // Constructor
    public Project(String projectName, String projectDescription, String projectOwner) {
        this.projectName = projectName;
        this.projectDescription = projectDescription;
        this.projectOwner = projectOwner;
        this.teamMembers = new ArrayList<>();
        this.risks = new ArrayList<>();
    }

    // Getters and Setters
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectOwner() {
        return projectOwner;
    }

    public void setProjectOwner(String projectOwner) {
        this.projectOwner = projectOwner;
    }

    public List<String> getTeamMembers() {
        return teamMembers;
    }

    public List<Risk> getRisks() {
        return risks;
    }

    // Functions
    public void addTeamMember(String member) {
        teamMembers.add(member);
    }

    public void removeTeamMember(String member) {
        teamMembers.remove(member);
    }

    public void addRisk(String description, String status) {
        Risk newRisk = new Risk(description, status);
        risks.add(newRisk);
    }

    public void updateRiskStatus(int riskIndex, String newStatus) {
        if (riskIndex >= 0 && riskIndex < risks.size()) {
            risks.get(riskIndex).setStatus(newStatus);
        } else {
            System.out.println("Invalid risk index.");
        }
    }

    public void viewDetails() {
        System.out.println("Project Name: " + projectName);
        System.out.println("Description: " + projectDescription);
        System.out.println("Owner: " + projectOwner);
        System.out.println("Team Members: " + teamMembers);
    }

    public void viewRisks() {
        System.out.println("Risks:");
        for (int i = 0; i < risks.size(); i++) {
            System.out.println((i + 1) + ". " + risks.get(i));
        }
    }

    // Inner Risk Class
    public static class Risk {
        private String description;
        private String status;

        public Risk(String description, String status) {
            this.description = description;
            this.status = status;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return "Risk: " + description + ", Status: " + status;
        }
    }
}
