Index.html file:
<html>
<title>april</title>
<body>
<form name="f1" action="april" method="get">
<!--<b>User Name : </b> <input type="text" name="s1"> <br><br>
<b>Password : </b> <input type="text" name="s2"> <br><br>-->
<input type="Submit" value="login " name="b1">
</form>
</body>
</html>
Web.xml file:
<web-app>
	<servlet>
      <servlet-name>details</servlet-name>
      <servlet-class>login</servlet-class>
    </servlet>
	<servlet-mapping>
        <servlet-name>details</servlet-name>
        <url-pattern>/april</url-pattern>
    </servlet-mapping>
</web-app>
Login.java file:
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.*;


public class login extends HttpServlet
{
public void doGet(
HttpServletRequest req,
HttpServletResponse res) throws
IOException,ServletException
{
res.setContentType("text/html");
PrintWriter out=res.getWriter();

Cookie ca[]=req.getCookies();
if(ca==null)
{
out.println("First Visit");
Cookie visit=new Cookie("vcnt","1");
visit.setMaxAge(24*3600);
res.addCookie(visit);
}
else
{
int counter=Integer.parseInt(ca[0].getValue());
counter++; //3  "3"
out.println(counter +" Visit");
ca[0].setValue(Integer.toString(counter));
res.addCookie(ca[0]);
}
}
}