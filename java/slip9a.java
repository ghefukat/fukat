import java.util.*;
import java.sql.*; //step 1 - import the package

public class InsertPreparedStatement {
    public static void main(String args[]) throws Exception
	{
	Connection con;
	PreparedStatement ps;
	String query;
	
	int a;
	String b;
	float c;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Pls Enter ENO");  
	a=sc.nextInt();						  	
	System.out.println("Pls Enter ENAME");
	b=sc.next();
	System.out.println("Pls Enter SAL");
	c=sc.nextFloat();
	
	
	Class.forName("com.mysql.jdbc.Driver");  //step 2 load & register the db driver
	
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root",""); //step 3 create the connection
	
	query="insert into emp values(?,?,?)"; //step 4 - make the query
		
	ps=con.prepareStatement(query);  //step 5
	create the statement
	
	ps.setInt(1,a);
	ps.setString(2,b);
	ps.setFloat(3,c);
	
	int n=ps.executeUpdate(); // step 6 fire the query
	if(n==1)
	System.out.println("RECORD INSERTED SUCCESSFULLY");
	else
	System.out.println("RECORD NOT INSERTED");
	
	ps.close();		//step 7 close the statement and connections
	con.close();
	
	}
}