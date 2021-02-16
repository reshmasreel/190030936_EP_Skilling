package com.ep.main;

import com.ep.bean.*;
import java.sql.SQLException;
import java.sql.*;
import java.util.*;
import com.ep.insertion.*;
import com.ep.deletion.*;
import com.ep.display.*;
import com.ep.updation.*;

public class StudentMain {
	static Scanner sc=new Scanner(System.in);
	public static void main(String args[]) throws ClassNotFoundException, SQLException{
		
		SampleTable st=new SampleTable();
		StudentInsertion si=new StudentInsertion();
		StudentDeletion sd=new StudentDeletion();
		StudentUpdation su=new StudentUpdation();
		StudentDisplay ss=new StudentDisplay();
		
		while(true) {
			int n;
			System.out.println("Enter your choice:");
			System.out.println("1. Insert a student data");
			System.out.println("2. Delete a student data");
			System.out.println("3. Update a student data");
			System.out.println("4. Display the student data");
			
			n=sc.nextInt();
			
			switch(n) {
			case 1: 
				int IDNum;
				String name,email,location;
				System.out.println("Enter student's ID");
				IDNum=sc.nextInt();
				System.out.println("Enter student's Name");
				name=sc.next();
				System.out.println("Enter student's Email");
				email=sc.next();
				System.out.println("Enter student's Location");
				location=sc.next();
				st.setIDNum(IDNum);
				st.setName(name);
				st.setEmail(email);
				st.setLocation(location);
				
				int i=si.StudentInsert(st);
				if(i>0) {
					System.out.println("Successful Insertion");
				}
				else {
					System.out.println("Try Again");
				}
				break;
				
			case 2:
				System.out.println("Enter Student ID to delete that student data");
				IDNum=sc.nextInt();
				st.setIDNum(IDNum);
				int j=sd.StudentDelete(st);
				if(j>0) {
					System.out.println("Successful Insertion");
				}
				else {
					System.out.println("Try Again");
				}
				break;
				
			case 3:
				int uIDNum;
				System.out.println("Enter The To Be Updated Student's ID Number : ");
				uIDNum = sc.nextInt();
				String uName,uEmail,uLocation;
				System.out.println("Enter Updated Student's Name : ");
				uName = sc.next();
				System.out.println("Enter Updated Student's Email : ");
				uEmail = sc.next();
				System.out.println("Enter Updated Student's Location : ");
				uLocation = sc.next();
				
				st.setIDNum(uIDNum);
				st.setName(uName);
				st.setEmail(uEmail);
				st.setLocation(uLocation);
				int l = su.StudentUpdate(st);
				if(l > 0)
				{
					System.out.println("Updation Successful!");
				}
				else
				{
					System.out.println("Please Try Again!");
				}
				break;
				
			case 4:
				ss.StudentDisplay(st);
				break;
			}
		}
	}

}
