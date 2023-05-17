import java.sql.*;  //step 1 - import the package

public class DeleteStudent
{
	public static void main(String args[]) throws Exception
	{
	Connection con;
	Statement st;
	String query;
	
	Class.forName("com.mysql.jdbc.Driver");  //step 2 load & register the db driver
	
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root",""); //step 3 create the connection
	
	st=con.createStatement();  //step 4 create the statement
	
	query="delete from college where Name like 'S%'"; //step 5 - make the query
	
	int n=st.executeUpdate(query); // step 6 fire the query
	if(n>0)
	System.out.println(n+" RECORDs DELETED SUCCESSFULLY");
	else
	System.out.println("RECORD NOT DELETED");
	
	st.close();		//step 7 close the statement and connections
	con.close();
	
	}
}
