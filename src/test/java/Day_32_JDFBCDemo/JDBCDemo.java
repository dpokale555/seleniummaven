package Day_32_JDFBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*1)Create a connection
 * 2) Create Statment/query
 * 3) Execute Statment?query
 * 4)Close connection
 */

public class JDBCDemo {

	public static void main(String[] args) throws SQLException {
		
		//1) Create a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		
		//thiere is diffrent connection strings syntax for diffrenty database.. search on google.
		
		//2) & 3) Create and Executed the statment/query
		Statement stmt=con.createStatement();
		String query="insert into table value(104,'smith')";
		stmt.execute(query);
		
		//4)Closed the connection
		con.close();
		
		System.out.println("Done!!");
	}

}
