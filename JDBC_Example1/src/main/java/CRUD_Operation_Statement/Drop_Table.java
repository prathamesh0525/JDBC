package CRUD_Operation_Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Drop_Table {

	public static void main(String[] args) throws Exception {
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
	    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh","root","PKale@2003");
	    Statement stmt=con.createStatement();
	    String sql="drop table if exists student";
	    stmt.executeUpdate(sql);
	    System.out.println("Successful Delete Table");
	    con.close();


	}

}
