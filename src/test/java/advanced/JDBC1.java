package advanced;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class JDBC1 
{
	
	@Test
	public void EstCon() throws SQLException
	{
		Connection Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/statesdb","root","jdbctest");
		if(Con==null)
		{
			System.out.println("Connection not established!");
		}
		else
		{
			System.out.println("Connecttion established!");
		}
	}

}
