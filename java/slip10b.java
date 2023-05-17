Html file:
<html>
<title>Product Details</title>
<body>
<form name="f1" action="sofiya" method="get">
<input type="Submit" value="Submit" name="s1">
</form>
</body>
</html>

Xml File:
<web-app>

	<servlet>
      <servlet-name>girl</servlet-name>
      <servlet-class>ProductListServlet</servlet-class>
    </servlet>
	<servlet-mapping>
        <servlet-name>girl</servlet-name>
        <url-pattern>/sofiya</url-pattern>
    </servlet-mapping>
</web-app>

Java File:
import java.io.*;
 import jakarta.servlet.*;
 import jakarta.servlet.http.*;
 import java.sql.*; 
 public class ProductListServlet extends HttpServlet{ 
	private Connection con; 
	private Statement s;
	private ResultSet rs ; 
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{ 
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter(); 
		
		try
		{ 
			Class.forName("com.mysql.jdbc.Driver");  
	
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root",""); 
			
			
			s = con.createStatement(); 
			rs = s.executeQuery("select * from product"); 
			out.print("<table border =1 bgcolor='yellow>"+ "etr bgcolor='red'>"+ "<th>Code</th><th>Name</th><th>Price</th></tr>") ;
		
			while(rs.next())
			{ 
				out.print("<tr>"+ 
				"<td>"+rs.getInt(1)+"</td>"+
				"<td>"+rs.getString( 2)+"</td>"+
				"<td>"+rs.getFloat(3)+"</td>"+ 
				"</tr>"); 
			}
			out.print("</table>") ; 
		}
		catch(Exception e)
		{ 
			out.print(e);
		}
	}
}