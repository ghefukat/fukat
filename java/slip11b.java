import java.sql.*;

public class Slip11_1_B {
	public static void main(String [] args) throws Exception 
	{
	Connection con;
	Statement st;
	String query;
	ResultSet rs;
	
	Class.forName("com.mysql.jdbc.Driver");  //step 2 load & register the db driver
	
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root",""); //step 3 create the connection
	
	st=con.createStatement();  //step 4 create the statement
	
	query="Select * from Product,Sales where Product.PID=Sales.Product_PID And Product.PID=101 And Sdate between '2022/05/20' and '2022/05/30';"; //step 5 - make the query
	
	rs=st.executeQuery(query); // step 6 fire the query
	while(rs.next())
	{
	 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getDate(7));
	}
	
	st.close();		//step 7 close the statement and connections
	con.close();
	
	}
}
