package com.Hospital;

import java.sql.SQLException;
import java.util.Scanner;

import com.client.Hospital;

public class test {

	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		while(true){
		Scanner sc=new Scanner(System.in);
		System.out.println("1.DisplayStaff Information");
		System.out.println("2.DisplayPatient Information");
		System.out.println("3.inserted staff Information");
		System.out.println("4.inserted patient Information");
		System.out.println("5.update staff Information");
		System.out.println("6.update patient Information");
		System.out.println("7.delete staff Information");
		System.out.println("8.update staff Information");
		System.out.println("select your choice");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:Hospital.displayStaff();
			break;
		case 2:Hospital.displaypatient();
			break;
		case 3:Hospital.insertstaff();
			break;
		case 4:Hospital.insertpatient();
		   break;
		case 5:Hospital.updatestaff();
			break;
		case 6:Hospital.updatepatient();
			break;
		case 7:Hospital.deletestaff();
			break;
		case 8:Hospital.deletepatient();
			break;
		default:
			System.out.println("correct your choice");
			
		}
		
	}
	}
}
