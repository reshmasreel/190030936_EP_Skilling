package com.ep.insertion;

import com.ep.bean.*;
import com.ep.connection.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentInsertion {
	
	public int StudentInsert(SampleTable student) throws ClassNotFoundException, SQLException{
		
		Connection con1=DBUtil.DBConnection();
		
		String query="insert into sample_table(id,name,email,location)"+"values(?,?,?,?)";
		
		PreparedStatement preparedStmt=con1.prepareStatement(query);
		
		preparedStmt.setInt(1, student.getIDNum());
		preparedStmt.setString(2, student.getName());
		preparedStmt.setString(3, student.getEmail());
		preparedStmt.setString(4, student.getLocation());
		
		int n=preparedStmt.executeUpdate();
		
		con1.close();
		
		return n;
	}

}
