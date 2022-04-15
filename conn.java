package com.AsimulatorSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
	Connection c;
	Statement s; //used to access out database.
	// to check the connection.
	public conn() {
		try {
			Class.forName("c://odbc6.ar"); //dynamically load the driver class file to memory.
			c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "cse_1958", "1958");//database url
			s = c.createStatement();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
