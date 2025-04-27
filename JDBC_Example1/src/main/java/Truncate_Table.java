import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Truncate_Table {

	public static void main(String[] args)throws Exception {
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
	    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh","root","PKale@2003");
	    Statement stmt=con.createStatement();
	    String sql="truncate table  student";
	    stmt.executeUpdate(sql);
	    System.out.println("Successful Truncate Table");
	    con.close();


	}

}
