package com.junit.apptest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@SuppressWarnings("static-access")
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
		
		void FirstByLamda()
		{
			 String regex="[A-Z]{1}[a-z]{2,10}$";
		 	 ArrayList <String> First_Name=new ArrayList<String>();
			System.out.println("enter number of input");
			int n1=sc.nextInt();
			for(int i=0; i<n1 ; i++) {
				First_Name.add(sc.next());
			}
			System.out.println("your list of first name "+First_Name.toString());
			Pattern pt = Pattern.compile(regex);
			
		    List<String> a1= First_Name. stream(). filter(p -> pt. matcher(p). find()). collect(Collectors.<String>toList());
			System.out.println("your correct inputs are"+a1);
			
		}
		
		
		
		void LastByLamda()
		{
			 String regex="[A-Z]{1}[a-z]{2,10}$";
		 	 ArrayList <String> Last_Name=new ArrayList<String>();
			//String mail1=sc.next();
			 System.out.println("enter number of input you wanna to give");
			 int n1=sc.nextInt();
			 for(int i=0; i<n1 ; i++) {
				Last_Name.add(sc.next());
			}
			System.out.println("your contains are "+Last_Name.toString());
			Pattern pt = Pattern.compile(regex);
			
		    List<String> a1= Last_Name. stream(). filter(p -> pt. matcher(p). find()). collect(Collectors.<String>toList());
			System.out.println("correct name format are "+a1);
			
		}
		
		
		
		
		void PhoneByLamda()
		{
			String regex="^\\+(?:[0-9] ?){6,14}[0-9]$";
		 	 ArrayList <String> phone_no=new ArrayList<String>();
			 System.out.println("enter number of input you wanna to give");
			 int n1=sc.nextInt();
			 for(int i=0; i<n1 ; i++) {
				phone_no.add(sc.next());
			}
			System.out.println("added contact number are "+phone_no.toString());
			Pattern pt = Pattern.compile(regex);
			
		    List<String> a1= phone_no. stream(). filter(p -> pt. matcher(p). find()). collect(Collectors.<String>toList());
			System.out.println(a1);
			
		}
		
		void PasswordByLamda()
		{
			 String regex="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#&$])(?=\\S+$).{4,10}$";
		 	 ArrayList <String> password=new ArrayList<String>();
			 System.out.println("enter number of input you wanna to give");
			 int n1=sc.nextInt();
			 for(int i=0; i<n1 ; i++) {
				password.add(sc.next());
			}
			System.out.println("your passwords are "+password.toString());
			Pattern pt = Pattern.compile(regex);
			
		    List<String> a1= password. stream(). filter(p -> pt. matcher(p). find()). collect(Collectors.<String>toList());
			System.out.println(a1);
			
		}	
		
		void checkemailByLamda()
		{
			 String regex="[a-zA-Z0-9_.]+@[a-zA-Z]+.[a-zA-Z]+$";
			ArrayList <String> mail=new ArrayList<String>();
			System.out.println("enter number of input you wanna to give");
			int n1=sc.nextInt();
			for(int i=0; i<n1 ; i++) {
				mail.add(sc.next());
			}
			System.out.println("your mails are "+mail.toString());
			Pattern pt = Pattern.compile(regex);
		    List<String> a1= mail. stream(). filter(p -> pt. matcher(p). find()). collect(Collectors.<String>toList());
			System.out.println("your correct mails are " +a1);
			
		}
		
		 static void end()
         {
      	System.out.println("thank you");
				exit=true;
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
    	
		while(!exit)
		{
		Scanner s=new Scanner(System.in);
         System.out.println("enter your choice to fill the details for registrartion");
        
         System.out.println("1. Enter for First name");
         System.out.println("2. Enter for Last name");
         System.out.println("3. Enter for Contact Number");
         System.out.println("4. Enter for Email Address");
         System.out.println("5. Enter for Password");
         System.out.println("-------------------------------------------------------------");
         System.out.println("6. Enter for First name through lamda function");
         System.out.println("7. Enter for Last name through lamda function");
         System.out.println("8. Enter for Contact Number through lamda function");
         System.out.println("9. Enter for Email Address through lamda function ");
         System.out.println("10.Enter for Password through lamda function");
         System.out.println("-------------------------------------------------------------");
         
         System.out.println("11. Finish And Exit ");
         int choice=s.nextInt();
         
         switch(choice)
         
         {
         case 1:
        	 
        	 boolean result1=new App().CheckFirstName();
         	if(result1==true)
         	{
         		System.out.println("valid");
         	}
         	else
         	{
         		System.out.println("invalid");
         	}        	 break;
        	 
         case 2:
        	 
        	 new App().CheckLastName();
        	 break;
        	 
         case 3:
        	 
        	 new App().checknumber();
        	 if(result==true)
         	{
         		System.out.println("valid");
         	}
         	else
         	{
         		System.out.println("invalid");
         	}

        	 break;
        	 
         case 4:
        	 new App().checkemail();
        	 
        	 break;
        	 
         case 5:
        	 
        	 new App().checkpassword();
        	 break;
        	 
        	 
         case 6 :
        	 new App().FirstByLamda();
        	 break;
        	 
         case 7 :
        	 new App().LastByLamda();
        	 break;
         
         case 8:
        	 new App().PhoneByLamda();
        	 break;
        	 
         case 9 :
        	 new App().checkemailByLamda();
        	 break;
        	 
         case 10 :
             new App().PasswordByLamda();
        	 break;
        	 
         case 11:
        	 end();
        	 break;
        
        		  
         }
		}
    	
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
