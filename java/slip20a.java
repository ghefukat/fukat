import java.util.*;
import java.sql.*;  //step 1 - import the package

public class DeletePreparedStatement
{
	public static void main(String args[]) throws Exception
	{
	Connection con;
	PreparedStatement ps;
	String query;
	
	int a,b;
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Pls Enter ENO");  
	a=sc.nextInt();
		
	
	
	Class.forName("com.mysql.jdbc.Driver");  //step 2 load & register the db driver
	
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root",""); //step 3 create the connection
	
	query="delete from emp where eno=?"; //step 5 - make the query
		
	ps=con.prepareStatement(query);  //step 4 create the statement
	
	ps.setInt(1,a);
	
	
	int n=ps.executeUpdate(); // step 6 fire the query
	if(n>0)
	System.out.println(n+" RECORDs DELETED SUCCESSFULLY");
	else
	System.out.println("RECORD NOT DELETED");
	
	ps.close();		//step 7 close the statement and connections
	con.close();
	
	}
}