import java.sql.*;  //step 1 - import the package

public class selectEmployee
{
	public static void main(String args[]) throws Exception
	{
	Connection con;
	Statement st;
	String query;
	ResultSet rs;
	
	Class.forName("com.mysql.jdbc.Driver");  //step 2 load & register the db driver
	
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root",""); //step 3 create the connection
	
	st=con.createStatement();  //step 4 create the statement
	
	query="select * from emp where ename like 'A%'"; //step 5 - make the query
	
	rs=st.executeQuery(query); // step 6 fire the query
	while(rs.next())
	{
	System.out.println(rs.getInt("eid") + rs.getString("ename") + rs.getInt("esal"));
	}
	
	st.close();		//step 7 close the statement and connections
	con.close();
	}
}