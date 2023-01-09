package sql_QuriesTest;

import java.sql.*;
import java.sql.DriverManager;

public class Connection_JDBC {

	public static void main(String[] args) {
		

		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3308/sys","root","root");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from personal");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+
					"  "+rs.getString(5));  
			con.close();  
			}catch(Exception e){ System.out.println(e);
			}  
			}  

}
