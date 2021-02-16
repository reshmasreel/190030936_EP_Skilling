package com.ep.deletion;

import com.ep.bean.*;
import com.ep.connection.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDeletion {
	public int StudentDelete(SampleTable student) throws ClassNotFoundException, SQLException{
		
Connection con1 = DBUtil.DBConnection();
		
		//PREPAREDSTATEMENTS
		// the mysql delete statement
		// the mysql insert statement
	      String query = " delete from sample_table where id = (?) ";
		
		
	    // create the mysql delete preparedstatement
	      PreparedStatement preparedStmt = con1.prepareStatement(query);
	      
	      preparedStmt.setLong (1, student.getIDNum());
	      
	    // execute the preparedstatement
	      int n = preparedStmt.executeUpdate();
	      
		con1.close();
		return n;
	}

}
