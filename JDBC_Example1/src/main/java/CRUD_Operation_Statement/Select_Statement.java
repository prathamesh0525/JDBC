package CRUD_Operation_Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select_Statement {

	public static void main(String[] args) throws Exception{
		        Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh","root","PKale@2003");
				Statement stmt=con.createStatement();
				String Query="Select*from student";
				ResultSet rs=stmt.executeQuery(Query);
				while(rs.next()) {
					int id=rs.getInt("id");
					String name=rs.getString("name");
					int age=rs.getInt("age");
					String place=rs.getString("place");
					System.out.println(id+" | "+name+" | "+age+" | "+place );
					
				}
	}

}
