package CRUD_Operation_Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
public class JDBC_Example1 {

	public static void main(String[] args)throws Exception {
		Connection con=null;
		Statement stmt=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","PKale@2003");
		stmt=con.createStatement();
		String query="create database if not exists ganesh";
		stmt.executeUpdate(query);
		System.out.println("Successful create Database");
		con.close();

	}

}
