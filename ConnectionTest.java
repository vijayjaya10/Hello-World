package com.vk.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	

	public static void main(String[] args) throws SQLException {
		oracle.jdbc.driver.OracleDriver driver = null;
		Connection con=null;

		// Register Jdbc Driver with drivermanagerService
		// create the object of type-4 driver class
		driver = new oracle.jdbc.driver.OracleDriver();
		// Register Driver with DriverManagerService
		DriverManager.registerDriver(driver);
		//Establish the connection with db s/w from java Appn
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		System.out.println(con.getClass());
		if(con!=null){
			System.out.println(" established the connection");
		}//if
		else{
			System.out.println("Connection is Not Established");
		}//else
	}//main

}//class
