package com.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Hospital {

	public static void displayStaff() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalManagement","root","root123");
	
		Statement st=con.createStatement();
		String query="select * from staff";
		
		ResultSet set=st.executeQuery(query);
		
		while(set.next())
		{
			System.out.println(set.getInt("id"));
			System.out.println(set.getString("name"));
			System.out.println(set.getInt("age"));
			System.out.println(set.getInt("Experiance"));
			System.out.println(set.getInt("DateOFJoining"));
			System.out.println("******************");
		}
		
		
	}
	public static void displaypatient() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalManagement","root","root123");
	
		Statement st=con.createStatement();
		String query="select * from patient";
		
		ResultSet set=st.executeQuery(query);
		
		while(set.next())
		{
			System.out.println(set.getInt("id"));
			System.out.println(set.getString("name"));
			System.out.println(set.getInt("age"));
			System.out.println(set.getInt("Experiance"));
			System.out.println(set.getInt("DateOFJoining"));
			System.out.println("******************");
		}
		
	}
	public static void insertstaff() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalManagement","root","root123");
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		System.out.println("Enter Experiance");
		int Experiance=sc.nextInt();
		
		System.out.println("Enter DateOfJOining");
		int DateOfJOining=sc.nextInt();
		
		//using prepared Statement
		
		PreparedStatement ps=con.prepareStatement("insert into staff values(?,?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2,name);
		ps.setInt(3, age);
		ps.setInt(4,Experiance);
		ps.setInt(5, DateOfJOining);
		
		int x=ps.executeUpdate();
		
		System.out.println(x);
		
		System.out.println("Data successfully inserted");
		
	}
	public static void insertpatient() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalManagement","root","root123");
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter age");
		int age=sc.nextInt();
		
		System.out.println("Enter DateOfAdmit");
		int DateOfAdmit=sc.nextInt();
		
		System.out.println("Enter  disease");
		String  disease=sc.next();
		
		//using prepared Statement
		
		PreparedStatement ps=con.prepareStatement("insert into staff values(?,?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2,name);
		ps.setInt(3, age);
		ps.setInt(4,DateOfAdmit);
		ps.setString(5,  disease);
		
		int x=ps.executeUpdate();
		
		System.out.println(x);
		
		System.out.println("Data successfully inserted");
		
	}
	public static void updatestaff() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalManagement","root","root123");
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		System.out.println("Enter name");
		String name=sc.next();
		

		
		//using prepared Statement
		
		PreparedStatement ps=con.prepareStatement("update staff set name=(?) where id=(?)");
		ps.setInt(2, id);
		ps.setString(1,name);

		
		int x=ps.executeUpdate();
		
		System.out.println(x);
		
		System.out.println("Data successfully inserted");
		
	}
	public static void updatepatient() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalManagement","root","root123");
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		System.out.println("Enter name");
		String name=sc.next();
		

		
		//using prepared Statement
		
		PreparedStatement ps=con.prepareStatement("update staff set name=(?) where id=(?)");
		ps.setInt(2, id);
		ps.setString(1,name);

		
		int x=ps.executeUpdate();
		
		System.out.println(x);
		
		System.out.println("Data successfully inserted");
		
	}
	public static void deletestaff() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalManagement","root","root123");
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		//System.out.println("Enter name");
		//String name=sc.next();
		

		
		//using prepared Statement
		
		PreparedStatement ps=con.prepareStatement("delete from staff where id=(?)");
		ps.setInt(1, id);
		//ps.setString(1,name);

		
		int x=ps.executeUpdate();
		
		System.out.println(x);
		
		System.out.println("Data successfully delete");
		
	}
	public static void deletepatient() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalManagement","root","root123");
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		//System.out.println("Enter name");
		//String name=sc.next();
		

		
		//using prepared Statement
		
		PreparedStatement ps=con.prepareStatement("delete from patient where id=(?)");
		ps.setInt(1, id);
		//ps.setString(1,name);

		
		int x=ps.executeUpdate();
		
		System.out.println(x);
		
		System.out.println("Data successfully delete");
		
	}
}
