package com.student;
import java.util.Scanner;

public class Student {
  //Student properties
	int studentId;
	String studentName;
	String studentAddress;
	long mobileNumber;
	int html,css,js,es6,reactjs,java;
	//actions
	void setDetails(int a,String b,String c,long d)	{
    studentId= a;
    studentName = b;
    studentAddress = c;
    mobileNumber = d;
   	}
	void setMarks(int u,int v,int w,int x, int y,int z)
	{
    html= u;
    css= v;
    js= w;
    es6= x;
    reactjs= y;
    java= z;
	}
	void allInfo()
	{
	System.out.println("Student id is: ");
	System.out.println("Student name is:"+studentName);
	System.out.println("Student address is:"+studentAddress);
	System.out.println("Mobilenumber is:"+mobileNumber );
	System.out.println("html mark is="+html);
	System.out.println("css mark is="+css);
	System.out.println("js mark is="+js);
	System.out.println("es6 mark is="+es6);
	System.out.println("reactjs mark is="+reactjs);
	System.out.println("java is="+java);
	}
	void marks()
	{
		int total = html+css+js+es6+reactjs+java;
		System.out.println("Total marks are : "+total);
		int avg = total/6;
		System.out.println("Average is : "+avg);
		if (avg>75)
		{
			System.out.println("Distinction");
		}
		else if(avg>60&&avg<75)
		{
			System.out.println("First class");
		}
		else if(avg>50&&avg<60)
		{
			System.out.println("Second class");
		}
		else if(avg>35&&avg<50)
		{
			System.out.println("Pass");
		}	
		else 
		{
			System.out.println("Fail");
		}	
	}
	public static void main(String[] args) {
		//need to give chance to end user 
		Scanner sc = new Scanner(System.in);
		System.out.println("Student Information");
		System.out.println("Please enter student Id");
		int a = sc.nextInt();
		System.out.println("Please enter student Name");
		String b = sc.next(); 
		System.out.println("Please enter student Address");
		String c = sc.next();
		System.out.println("Please enter mobileNumber");
		long d = sc.nextLong();	
		System.out.println("Please enter marks of html");
		int u = sc.nextInt();	
		System.out.println("Please enter marks of css");
		int v = sc.nextInt();	
		System.out.println("Please enter marks of js");
		int w = sc.nextInt();
		System.out.println("Please enter marks of es6");
		int x = sc.nextInt();	
		System.out.println("Please enter marks of reactjs");
		int y = sc.nextInt();
		System.out.println("Please enter marks of java");
		int z = sc.nextInt();	
//create object for Student class
		Student s = new Student();
		s.setDetails(a, b, c, d);
		s.setMarks(u,v,w,x,y,z);
		s.allInfo();
		s.marks();
		
	}

}
