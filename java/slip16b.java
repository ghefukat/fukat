import java.util.*;
import java.sql.*;  //step 1 - import the package

public class Slip16_q2
{
	public static void main(String args[]) throws Exception
	{
	Connection con;
	PreparedStatement ps=null;
	String query,query2;
	Statement st;
	ResultSet rs;
	int nos;
	int a,n,c;
	String b;
	
	Class.forName("com.mysql.jdbc.Driver");  //step 2 load & register the db driver
	
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root",""); //step 3 create the connection
	
	Scanner sc = new Scanner(System.in);  
	
	System.out.println("Enter number of students: ");
	nos = sc.nextInt();              
 
	for(int i=1;i<=nos;i++)
	{
	System.out.println("Pls Enter ENO");  
	a=sc.nextInt();						  	
	System.out.println("Pls Enter ENAME");
	b=sc.next();
	System.out.println("Pls Enter SAL");
	c=sc.nextInt();
	
	query="insert into student values(?,?,?)"; //step 4 - make the query
		
	ps=con.prepareStatement(query);  //step 5 create the statement
	
	ps.setString(1,b);
	ps.setInt(2,a);
	ps.setInt(3,c);
	
	n=ps.executeUpdate(); // step 6 fire the query
	
	
	if(n>0)
	System.out.println("RECORD INSERTED SUCCESSFULLY");
	else
	System.out.println("RECORD NOT INSERTED");
	}
	
	ps.close();	
	
	st=con.createStatement();  //step 4 create the statement
	
	query2="select * from student where percentage=(select max(percentage) from student)"; //step 5 - make the query
	
	rs=st.executeQuery(query2); // step 6 fire the query
	
	System.out.println("DETAILS OF STUDENT HAVING MAXIMUM PERCENTAGE IS AS FOLLOWS");
	while(rs.next())
		{
			System.out.println(rs.getInt("rno") + rs.getString("sname") + rs.getInt("percentage"));
		}
	st.close();	
	con.close();
	}
	
}