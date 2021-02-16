package com.junit.apptest;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App 
{
	static Scanner sc= new Scanner(System.in);
	static boolean exit=false;
	
		public static boolean CheckFirstName()
		{
		
			System.out.println("enter your name");
			String firstName=sc.next(); 
			
			String regex="[A-Z]{1}[a-z]{2,10}$";
			Pattern p = Pattern.compile(regex);
			
			 Matcher m = p.matcher(firstName);
			 boolean m1=m.matches();
			 System.out.println(m1);
			
			 if (m1==false)
			 {
				 
				 System.out.println("invalid inputs in name please renter in the correct format");
				 
			 }
			 
			 else
			 {
				 System.out.println("your name "+firstName);
			 }
			 return m1;
		}
		
	public static boolean CheckLastName()
	{
			
			System.out.println("enter your Last name");
			String lastName=sc.next(); 
			
			String regex="[A-Z]{1}[a-z]{2,10}$";
			Pattern p = Pattern.compile(regex);
			
			 Matcher m = p.matcher(lastName);
			 boolean m1=m.matches();
			 System.out.println(m1);
			
			 if (m1==false)
			 {
				 
				 System.out.println("invalid inputs in name");
				 
			 }
			 
			 else
			 {
				 System.out.println("your name "+lastName);
			 }
			 return m1;
		}
		public static boolean checknumber() 
		{
			
			    System.out.println("enter the phone number");
			    String phone=sc.next();
			    String regex="^\\+(?:[0-9] ?){6,14}[0-9]$";
				Pattern p = Pattern.compile(regex);
				
				 Matcher m = p.matcher(phone);
				 boolean m1=m.matches();
				 System.out.println(m1);
				 if (m1==false)
				 {
					 
					 System.out.println("invalid inputs!!please enter correct format");
				 }
				 
				 else
				 {
					 System.out.println("your contact number "+phone);
				 }
				 return m1;
			
		}
		
		public static boolean checkpassword() 
		{
			
			System.out.println("enter the password");
			 int count=0;
			  boolean m1=true;
			for(int i= 0; i<5 ; i++)
			{
			    String password=sc.next();
			    String regex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#&$])(?=\\S+$).{4,10}$";
				Pattern p = Pattern.compile(regex);
				
				 Matcher m = p.matcher(password);
				  m1=m.matches();
				 System.out.println(m1);
				count+=1;

				 if (m1==false)
				 {
					 
					 System.out.println("invalid inputs for password");
					 System.out.println("you hav used "+count+ " from maximun 5 attempts");
					 continue;
					 
				 }
				 
				 else
				 {
					 System.out.println("your password "+password);
					
					 System.out.println("please Re-enter the correct password");
					 String password2=sc.next();
					 if(password2.contains(password))
					 {
						 System.out.println("you have succesfully set your password");
						
					 }
					 else
					 {
						 System.out.println("Re-enter the password ");
						 continue;
					 }
					 break;
				 }
				
			}
				
			return m1;  
		}
				
    public static void main( String[] args )
    {
    	boolean result=new App().CheckFirstName();
    	if(result==true)
    	{
    		System.out.println("valid");
    	}
    	else
    	{
    		System.out.println("invalid");
    	}
    	
    	new App().CheckLastName();
    	
    	boolean result1=new App().checknumber();
    	if(result1==true)
    	{
    		System.out.println("valid");
    	}
    	else
    	{
    		System.out.println("invalid");
    	}
    	
    	new App().checkemail();
    	
    	new App().checkpassword();
    }

	public static boolean checkemail() 
	{
		System.out.println("Enter your Email Address");
		String email=sc.next();
		    String regex="[a-zA-Z0-9_.]+@[a-zA-Z.]+$";
			Pattern p = Pattern.compile(regex);
			
			 Matcher m = p.matcher(email);
			 boolean m1=m.matches();
			 System.out.println(m1);
		
			 if (m1==false)
			 {
				 
				 System.out.println("invalid inputs for email please renter in the correct format");
				 
				 
			 }
			 
			 else
			 {
				 System.out.println("your email is "+email);
			 }
			return m1;
	}
}
