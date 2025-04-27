import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
public class Insert_Value {
	public static void main(String[] args) throws Exception {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ganesh","root","PKale@2003");
		Statement stmt=con.createStatement();
		String Query="insert into student values(2,'Ganesh',24,'Nagar')";
		
	int count=stmt.executeUpdate(Query);
	System.out.println(count>0?"Sussesful Inserted Data":"not inserted");
	
	
		
		
	
	}

}
