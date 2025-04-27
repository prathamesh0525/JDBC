package CRUD_Operation_Statement;
import java.sql.*;
public class Create_Table {

	public static void main(String[] args) throws Exception {
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
	    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh","root","PKale@2003");
	    Statement stmt=con.createStatement();
	    String sql="Create table if not exists Student(id int primary key,name varchar(50),age int ,place text )";
	    stmt.executeUpdate(sql);
	    System.out.println("Successful Create Table");
	    con.close();

	}

}
