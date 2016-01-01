package com.ust.datadriven.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static com.ust.datadriven.utility.ConfigReader.*;

public class DBReader {
	private static DBReader reader = null;
	
	private DBReader(){}
	
	public static DBReader getObject(){
		if(reader==null){
			reader = new DBReader();
		}
		return reader;
	}
	/*public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DBReader reader = new DBReader();
		reader.readDB();
	}*/
	public Object[][] readDB() throws ClassNotFoundException, SQLException{
		Object array[][]= 
				new Object[getRow()][getColumn()];
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// Step -1 Load the Driver (Class)
		// It is Just Loading a Class
		//com.mysql.jdbc.Driver
		//oracle.jdbc.driver.OracleDriver
		// org.postgresql.Driver
		try{
		Class.forName(getDriver()); // this is used to load a class
		// First Load the Class and then create the Object
		//Driver driver = new Driver();
		
		// Step -2 Create a Connection
		// jdbc:oracle:thin:@localhost:1521:dbname
		// jdbc:mysql://localhost:3306/dbname"
		 con = DriverManager.
				getConnection(getConnectionURL(),getUserid(),getPassword());
		if(con!=null){
			System.out.println("Connection Created...");
		}
		// Step- 3 DO the Query
		 pstmt = con.prepareStatement(getSQL());
		// Step -4 Get the Query Result and Store in ResultSet
		 rs = pstmt.executeQuery();
		// Step -5 Traverse the ResultSet 
		int row = 0;
		while(rs.next()){
			array[row][0]=rs.getString("userid");
			array[row][1]=rs.getString("password");
			row++;
			//System.out.println(rs.getString("userid")+" "+rs.getString("password"));
		}
		}
		// Step - 6 Close the Resources
		finally{
		rs.close();
		pstmt.close();
		con.close();
		}
		return array;
	}

}
