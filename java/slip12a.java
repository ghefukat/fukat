import java.sql.*;

public class Slip12_q1
{
	public static void main(String args[])
	{
	Connection con;
	Statement st;
	String query;
	ResultSet rs;

	try
	{
		Class.forName("com.mysql.jdbc.Driver");

		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");
		st=con.createStatement();

		query="select * from emp";

		rs=st.executeQuery(query);
		int count=0;
		while(rs.next())
		{
			count++;
		}

		System.out.println("The number of records are: "+count);
		st.close();
		con.close();
	}
	catch(Exception e)
	{
		System.out.println();
	}
	}
}
