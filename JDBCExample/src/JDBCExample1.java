import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample1 {
	
	// Create a connection
	// Create a query/ statement 
	// Executes the query / statement 
	// Close connection 
	

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("url");
		
		//create statement 
		Statement stmt = con.createStatement();
		
	//	String s = "insert into student values (101.'Scott')";    insert data
		
	//	String s = "update student set sname='kim' where sid=105";   // update data 
		
	//	String s = "delete student where sid=105";   // delete  data 
 
		String s = "Select employee_id,first_name,last_name from employees";
		
		
		// Execute statement query
		ResultSet rs = stmt.executeQuery(s);
		
		
		while (rs.next())
		{
			int eid= rs.getInt("Employee_Id");
			String fname=rs.getString("first_name");
			String lname=rs.getString("last_name");
           System.out.println(eid+"     "+fname+"   "+ lname);
		}
		 
		
		// Executes the query / statement 

	//	stmt.executeQuery(s);


	 
		// Close connection 
        con.close();
        
        System.out.println("Programm is completed");
	}

}
