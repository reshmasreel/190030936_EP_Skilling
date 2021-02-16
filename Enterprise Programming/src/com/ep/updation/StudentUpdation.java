package com.ep.updation;

import com.ep.bean.*;
import com.ep.connection.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentUpdation {
	public int StudentUpdate(SampleTable student) throws ClassNotFoundException, SQLException{
		
Connection con1 = DBUtil.DBConnection();
		
		//PREPAREDSTATEMENTS
		// the mysql update statement
	    String query = " update sample_table set name = ?, email = ?, location = ? where id = ?";
		
	    // create the mysql update preparedstatement
	      PreparedStatement stmt = con1.prepareStatement(query);
	    
	      stmt.setString(1, student.getName());
	      stmt.setString(2, student.getEmail());
	      stmt.setString(3, student.getLocation());
	      stmt.setInt(4, student.getIDNum());
	      
	    // execute the preparedstatement
	    int n = stmt.executeUpdate();
	      
		con1.close();
		return n;
			}

}
