 
	package com.pack1;
	import java.util.Scanner;

	public class JobPath extends CareerPath 
	{
	    public void displayRoadMap(Scanner sc)
	    {
	    	System.out.println();
	    	System.out.println("before going for an interview , PLZ FOLLOW THE BELOW STEPS ONCE 👇👇👇:");
	    	System.out.println();
	        System.out.println("-> Build your resume and portfolio");
	        System.out.println("-> Apply to jobs and internships");
	        System.out.println("-> Practice interviews and networking");
	        System.out.println();
	      
	        System.out.print("Enter result (1.selected for the job/ 2.not selected for the job): ");
	        int result = sc.nextInt();
	        if (result == 1) 
	        {
	            System.out.println("🎉 CONGRATULATIONS! YOU GOT THE JOB! 🎉");
	            System.out.println("+-------------------------------+\r\n"
         		   		+ "| . . C . . O . . N . . G . . |\r\n"
         		   		+ "| . R . . A . . T . . U . . L |\r\n"
         		   		+ "| . . A . . T . . I . . O . . |\r\n"
         		   		+ "| . N . . S . . . . . . . . . |\r\n"
         		   		+ "+-------------------------------+");
	           
	        } 
	        else 
	        {
	            System.out.println("Upskill needed. Choose a training institute.");
	            Instituteselection.chooseInstitute(sc);
	        }
	    }
	}


