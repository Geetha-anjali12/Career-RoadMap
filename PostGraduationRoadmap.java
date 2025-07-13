package com.pack1;
import java.util.*;
import java.io.*;

public class PostGraduationRoadmap {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Reflection Phase
        System.out.println("                           ---------------------------------------------------🎓 POST-GRADUATION ROAD MAP---------------------------------------------                      \n");
        System.out.println("STEP 1: REFLECT AND ASSESS");
        System.out.println("------");
        System.out.println("                            -> Evaluate your interests and strengths");
        System.out.println("                                     -> Clarify your short- and long-term goals");
        System.out.println("                                                -> Understand your financial situation\n");

        // Step 2: User selects a path
        System.out.println("STEP 2:🔍 CHOOSE YOUR PATH");
        System.out.println("------");
        System.out.println("                           1. Job/Industry");
        System.out.println("                           2. Higher Studies");
        System.out.println("                           3. Entrepreneurship");
        System.out.println("                           4. Gap Year / Other");
        System.out.print("\nEnter your choice (1-4): ");
        int choice = scanner.nextInt();

        List<String> roadmap = new ArrayList<>();

        switch (choice) 
        {
            case 1:
                roadmap.add("Build your resume and portfolio");
                roadmap.add("Apply to jobs and internships");
                roadmap.add("Practice interviews and networking");
                roadmap.add("Upskill with relevant certifications");
                break;
            case 2:
                roadmap.add("Choose country/university/program");
                roadmap.add("Prepare for exams like GRE/IELTS/GATE");
                roadmap.add("Write SOP, get LORs, and apply");
                roadmap.add("Look for scholarships and assistantships");
                break;
            case 3:
                roadmap.add("Validate your business idea");
                roadmap.add("Build an MVP and conduct market research");
                roadmap.add("Find co-founders or join an incubator");
                roadmap.add("Pitch to investors and seek funding");
                break;
            case 4:
                roadmap.add("Travel, volunteer, or explore passions");
                roadmap.add("Take care of your mental health");
                roadmap.add("Reflect, upskill, or try fellowships");
                break;
            default:
                System.out.println("❌ Invalid choice. Please run the program again.");
                scanner.close();
                return;
        }

        // Step 3: Display selected roadmap
        System.out.println("\nSTEP 3:📋YOUR SELECTED ROADMAP:");
        System.out.println("------");
        
        for (String step : roadmap) {
            System.out.println("                           -> " + step);
        }

        // Step 4: Write to file using FileWriter
        try {
            FileWriter writer = new FileWriter("roadmap.txt");
            writer.write("Your Post-Graduation Roadmap:\n");
            for (String step : roadmap) {
                writer.write("- " + step + "\n");
            }
            writer.close();
            System.out.println("\n✅ Roadmap saved to 'roadmap.txt'");
        } catch (IOException e) {
            System.out.println("❌ Error writing to file: " + e.getMessage());
        }

        System.out.println("🔧 Execute and Grow!");
        scanner.close();
    }
}
