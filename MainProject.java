
	package com.pack1;
	import java.util.Scanner;

	public class MainProject {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        StudentDetails s = new StudentDetails();
	        s.inputDetails(sc);
	        s.displayGraduationMessage();
	        
	        System.out.println("                                             ................................ ");
    	    System.out.println("                                             |||||||||||||||||||||||||||||||| ");
    	    System.out.println("                                             ....🎓🎓🎓......................\n ");
    	    
    	    
    	    System.out.println("                                              C⤷a⤷r⤷e⤷e⤷r   R⤷o⤷a⤷d    M⤷a⤷p\n");
    	    
    	    System.out.println("                                             .....................🎓🎓🎓.....");
    	    System.out.println("                                             |||||||||||||||||||||||||||||||| ");
    	    System.out.println("                                             ................................\n");

	        System.out.println("STEP 2:🔍 CHOOSE YOUR PATH");
	        System.out.println("1. Job/Industry");
	        System.out.println("2. Higher Studies");
	        System.out.println("3. Entrepreneurship");
	        System.out.println("4. Gap Year / Other");
	        System.out.print("Enter your choice (1-4): ");
	        int choice = sc.nextInt();

	        CareerPath path = null;
	        switch (choice) 
	        {
	            case 1: 
	            	path = new JobPath();//@override
	            	break;
	            case 2:
	            	path = new HigherStudiesPath();
	            	break;
	            case 3: 
	            	path = new EntrepreneurPath();
	            	break;
	            case 4: 
	            	path = new GapYearPath();
	            	break;
	            default:
	                System.out.println("❌ Invalid choice.");
	                System.exit(0);
	        }

	        System.out.println("\nSTEP 3:📋 YOUR SELECTED ROADMAP:");
	        path.displayRoadMap(sc);
	        sc.close();
	    }
	}


