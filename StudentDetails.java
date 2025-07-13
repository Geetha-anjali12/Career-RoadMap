
package com.pack1;
import java.util.Scanner;

public class StudentDetails 
{
    private String degree;
    private int age;

    public void inputDetails(Scanner sc) 
    {
        System.out.print("Enter your Degree: ");
        degree = sc.next();
        System.out.print("Enter your Age: ");
        age = sc.nextInt();
    }

    public void displayGraduationMessage() 
    {
        if (age < 21) 
        {
            System.out.println("Your graduation completes in " + (21 - age) + " years...");
        }
        System.out.println("My " + degree + " Graduation completed!!! 🎓🎓🎓\n");
    }

    public int getAge()
    {
        return age;
    }
}
