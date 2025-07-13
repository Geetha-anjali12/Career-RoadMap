
	package com.pack1;
	import java.util.Scanner;

	public class HigherStudiesPath extends CareerPath
	{
		 
	    public void displayRoadMap(Scanner sc)
	    {
	        System.out.println("-> Choose country/university/program");
	        System.out.println("-> Prepare for exams like GRE/IELTS/GATE");
	        System.out.println("-> Write SOP, get LORs, and apply");
	        System.out.println("-> Look for scholarships and assistantships");
	    }
	    class step1
	    {
	    	
	    	static
	    	{
	    		Scanner sc=new Scanner(System.in);
                System.out.println("---------------choice-1--------------");
                System.out.println("Enter ur country name");
                String country=sc.nextLine();
                System.out.println("Enter ur university name");
                String university=sc.nextLine();
                System.out.println("Enter ur program name");
                String pragram=sc.nextLine();
	    		System.out.println("joining is completed");
	    		System.out.println("static block executed");
	    	}
	    	{
	    		Scanner sc=new Scanner(System.in);
	    		System.out.println("---------------choice-2--------------");
	    		System.out.println("Enter ur exam name");
                String exam=sc.nextLine();
                System.out.println("prepare for "+exam);
	    		System.out.println("instatnce block");
	    	}
	    	step1()
	    	{
	    		System.out.println("---------------choice-3--------------");
	    		System.out.println("Write SOP, get LORs, and apply");
	    		System.out.println("---------------choice-4--------------");
	    		System.out.println("Look for scholarships and assistantships");
	    		System.out.println("inner class constructor");
	    	}
	    }
	    
	}


