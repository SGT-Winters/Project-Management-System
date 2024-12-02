package com.project;

/**
 * Represents a risk associated with a project.
 */
public class Risk {

    private String description;
    private String status;
    private String severity;
    private String mitigationPlan;

    // Constructor
    public Risk(String description, String status, String severity, String mitigationPlan) {
        this.description = description;
        this.status = status;
        this.severity = severity;
        this.mitigationPlan = mitigationPlan;
    }

    // Getters and Setters
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

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getMitigationPlan() {
        return mitigationPlan;
    }

    public void setMitigationPlan(String mitigationPlan) {
        this.mitigationPlan = mitigationPlan;
    }

    // Display risk details
    @Override
    public String toString() {
        return "Risk{" +
                "Description='" + description + '\'' +
                ", Status='" + status + '\'' +
                ", Severity='" + severity + '\'' +
                ", MitigationPlan='" + mitigationPlan + '\'' +
                '}';
    }
}
