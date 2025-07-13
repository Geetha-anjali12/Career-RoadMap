
	package com.pack1;
	import java.util.Scanner;

	public class Instituteselection
	{
	    public static void chooseInstitute(Scanner sc) 
	    {
	        System.out.println("==> NIT");
	        System.out.println("==> Qspiders");
	        System.out.println("==> Others");
	        System.out.print("Enter your institute name: ");
	        String name = sc.next();
	        
	        switch(name)
	        {
	    case "Qspiders":
       	 System.out.println("      		                                --------------------------------------------------------------------------\r\n"
       	 		+ "		                                |                       Q SPIDERS Technology Courses                     |\r\n"
       	 		+ "		                                --------------------------------------------------------------------------\r\n"
       	 		+ "		                                | Institute Name     :   [QSP]                                           |\r\n"
       	 		+ "		                                | Location           :   [HYDERABAD, Telangana]                          |\r\n"
       	 		+ "		                                | Courses Offered    :                                                   |\r\n"
       	 		+ "		                                |   - Java   :            Basic, Advanced,java with DSA                  |\r\n"
       	 		+ "		    	                        |   - Python :            Basic, Data Science, Full Stack                |\r\n"
       	 		+ "		                                |   - .NET   :            .NET Core                                      |\r\n"
       	 		+ "		                                |   - Others :            Power BI,Devops with AWS,etc,...               |\r\n"
       	 		+ "		                                | Contact Information:    [+91 xxxxxxxxxx, xxxxxxxx@gmail.com            |\r\n"
       	 		+ "		                                                                               (Q SPIDERS) website]       \r\n"
       	 		+ "		                                | Key Features       :    [e.g. Experienced faculty,Placement assistance,|\r\n"
       	 		+ "		                                --------------------------------------------------------------------------");
       	    System.out.println("please enter  course name: "); 
         	String course1 =sc.next();
         	
         	System.out.println("...................   WELCOME TO "+name+" " +course1 +"  course!!!  ................\r\n\n");
       	    break;
        case "NIT":
       	 System.out.println("                                                --------------------------------------------------------------------------\r\n"
    		    	 +"                                               |                       Naresh Institute Technology Courses              |\r\n"
    		    	 +"                                               --------------------------------------------------------------------------\r\n"
    		    	+"                                               | Institute Name     :   [NIT]                                           |\r\n"
    		    	+"                                               | Location           :   [Hyderabad, Telangana]                          |\r\n\n\n"
    		    	+"                                               | Courses Offered    :                                                   |\r\n\n"
    		    	+"                                               |   - Java   :            Basic, Advanced,java with DSA                  |\r\n"
    		    	+"                                               |   - Python :            Basic, Data Science, Full Stack                |\r\n"
    		    	+"                                               |   - .NET   :            ASP.NET,.NET Core                              |\r\n"
    		    	+"                                               |   - Others :            Power BI,Devops with AWS,Azure DevOps etc,...  |\r\n\n\n"
    		    	+"                                               | Contact Information:    [+91 xxxxxxxxxx, xxxxxxxx@gmail.com            |\r\n"
    		    	+"                                               |                         ( Naresh i Tech) website]\r\n\n" 
    		    	+"                                               | Key Features       :    [e.g. Experienced faculty,Placement assistance,|\r\n"
    		    	+"                                               |                         Hands-on training, Certifications             \r\n"
    		    	+"                                               --------------------------------------------------------------------------");
       	 System.out.println("please enter  course name: "); 
         	String course2 =sc.next();
         	System.out.println("...................   WELCOME TO "+name+" " +course2 +"  course!!!  ................\r\n\n");
         	break;
        
        default:
       	 System.out.println("----------");
       	 System.out.println("----------");
       	 System.out.println("----------");
       	 System.out.println("----------");
       	    System.out.print("Enter the course name: ");
            String course = sc.next();
       	    System.out.println("Welcome to " + name + " - " + course + " course!!! 🎓");
	    }
	}
}


