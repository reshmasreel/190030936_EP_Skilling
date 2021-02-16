package com.ep.display;

import com.ep.bean.*;
import com.ep.connection.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDisplay {
	public void StudentDisplay(SampleTable student) throws ClassNotFoundException, SQLException
	{
		Connection con1 = DBUtil.DBConnection();
		
		//PREPAREDSTATEMENTS
		// the mysql display statement
	      String query = " select * from sample_table";
		
	    // create the mysql display preparedstatement
	      PreparedStatement stmt = con1.prepareStatement(query);	      
	      
	    // execute the preparedstatement
	      ResultSet rs = stmt.executeQuery();
	      
	      while(rs.next())
	      {
	    	  System.out.println(rs.getLong(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " ");
	      }
	     
		con1.close();
	}

}
