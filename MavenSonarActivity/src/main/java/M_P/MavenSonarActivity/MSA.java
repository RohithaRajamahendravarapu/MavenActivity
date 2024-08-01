package M_P.MavenSonarActivity;

import java.util.*;

public class MSA {
    public static void main(String[] args) {
        // Create a TreeMap to store markets (countries) and their projects
        SortedMap<String, String> marketProjects = new TreeMap<String, String>();

        // Add some markets and their associated projects
        marketProjects.put("United States", "Project A, Project B");
        marketProjects.put("Germany", "Project X, Project Y");
        marketProjects.put("Japan", "Project 1, Project 2");
        marketProjects.put("Australia", "Project M, Project N");

        // Display the sorted map and its entries
        System.out.println("Markets and Projects:");
        for (Map.Entry<String, String> entry : marketProjects.entrySet()) {
            System.out.println("Market: " + entry.getKey() + " | Projects: " + entry.getValue());
        }
    }
}


