package com.project;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // General Info Input
        System.out.println("=== Welcome to the Project Management System ===");
        System.out.print("Enter project name: ");
        String projectName = scanner.nextLine();

        System.out.print("Enter project description: ");
        String projectDescription = scanner.nextLine();

        System.out.print("Enter project manager/owner name: ");
        String projectOwner = scanner.nextLine();

        Project generalInfo = new Project(projectName, projectDescription, projectOwner);

        // Adding Team Members
        System.out.println("\nEnter team members (type 'done' when finished):");
        while (true) {
            System.out.print("Enter team member name: ");
            String teamMember = scanner.nextLine();
            if (teamMember.equalsIgnoreCase("done")) break;
            generalInfo.addTeamMember(teamMember);
        }

        // Adding Risks
        System.out.println("\nEnter project risks (type 'done' when finished):");
        while (true) {
            System.out.print("Enter risk description: ");
            String riskDescription = scanner.nextLine();
            if (riskDescription.equalsIgnoreCase("done")) break;

            System.out.print("Enter risk status: ");
            String riskStatus = scanner.nextLine();
            generalInfo.addRisk(riskDescription, riskStatus);
        }

        // Requirements Input
        RequirementList requirementsList = new RequirementList();
        System.out.println("\nEnter project requirements (type 'done' when finished):");
        while (true) {
            System.out.print("Enter requirement type (Functional/Non-Functional): ");
            String type = scanner.nextLine();
            if (type.equalsIgnoreCase("done")) break;

            System.out.print("Enter requirement description: ");
            String description = scanner.nextLine();

            if (type.equalsIgnoreCase("Functional")) {
                requirementsList.addFuncReq(description);
            } else if (type.equalsIgnoreCase("Non-Functional")) {
                requirementsList.addNFuncReq(description);
            } else {
                System.out.println("Invalid type! Please enter 'Functional' or 'Non-Functional'.");
            }
        }

        // Effort Tracking
        EffortModule effortModule = new EffortModule();
        System.out.println("\nLog project efforts (type 'done' when finished):");
        while (true) {
            System.out.print("Enter task type (e.g., Requirements Analysis, Coding): ");
            String taskType = scanner.nextLine();
            if (taskType.equalsIgnoreCase("done")) break;

            System.out.print("Enter hours spent: ");
            int hoursSpent = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter task description: ");
            String taskDescription = scanner.nextLine();

            effortModule.logEffort(taskType, hoursSpent, taskDescription);
        }

        // Display Summary
        System.out.println("\n=== Project Summary ===");
        generalInfo.viewDetails();
        generalInfo.viewRisks();
        requirementsList.listReq();
        effortModule.getEffort();

        scanner.close();
    }
}
