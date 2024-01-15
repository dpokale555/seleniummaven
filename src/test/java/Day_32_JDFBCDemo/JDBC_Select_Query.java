package Day_32_JDFBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Select_Query {

	public static void main(String[] args) throws SQLException {
		//1) Create a connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
				
		//2) & 3) Create and Executed the statment/query
		Statement stmt=con.createStatement();
		
		String select_qry="Select * from table";
				
		//4)capture the result
		ResultSet rs=stmt.executeQuery(select_qry);
		
		while(rs.next())
		{
			String my1stcolumn=rs.getString("1stColumnName");
			String my2ndcolumn=rs.getString("2ndcolumn");
			
			System.out.println(my1stcolumn+"    "+my2ndcolumn);
		}
				
		//5)Closed result set & connection
		con.close();
				
		System.out.println("Done!!");

	}

}
