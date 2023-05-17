// index.html
<html>
<head>
<title>Slip 4</title>
</head>
<body>

<form name="f1" action="sofiya" method="get" >
  <p>  <input type="Submit" value="Submit" name="B1"></p>
</form>

</body>

</html>

//web.xml
<web-app>

	<servlet>
      <servlet-name>girl</servlet-name>
      <servlet-class>Slip4</servlet-class>
    </servlet>
	<servlet-mapping>
        <servlet-name>girl</servlet-name>
        <url-pattern>/sofiya</url-pattern>
    </servlet-mapping>
</web-app>

Slip4.java
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class Slip4 extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<head>");
        out.println("<title>Request Information</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>Request Information</h3><br>");
        out.println("Method: " + request.getMethod()+"<br>");
        out.println("Request URI: " + request.getRequestURI()+"<br>");
        out.println("Protocol: " + request.getProtocol()+"<br>");
        out.println("PathInfo: " + request.getPathInfo()+"<br>");
        out.println("Remote Address: " + request.getRemoteAddr()+"<br>");
        out.println("Remote Host: " + request.getRemoteHost()+"<br>");
        out.println("Remote User: " + request.getRemoteUser()+"<br>");
        Enumeration e = request.getHeaderNames();
        while (e.hasMoreElements())
        {
            String name = (String)e.nextElement();
            String value = request.getHeader(name);
            out.println(name + " : " + value+"<br>");
        }
        out.println("<h3>Server Information</h3><br>");
	out.println("getServerName(): " + request.getServerName()+"<br>");
	out.println("getServerPort(): " + request.getServerPort()+"<br>");
	out.println("getServletContext().getServerInfo(): " + getServletContext().getServerInfo()+"<br>");
	out.println("getServerInfo() name: " + getServerInfoName(getServletContext().getServerInfo())+"<br>");
	out.println("getServerInfo() version: " + getServerInfoVersion(getServletContext().getServerInfo())+"<br>");
	out.println("getServletContext().getAttribute(\"attribute\"): " + getServletContext().getAttribute("attribute")+"<br>");

	ServletContext context = getServletContext();
	Enumeration names = context.getServletNames();
	while (names.hasMoreElements())
	{
		String name = (String)names.nextElement();
		Servlet servlet = context.getServlet(name);
		out.println("Servlet name: " + name+"<br>");
		out.println("Servlet class: " + servlet.getClass().getName()+"<br>");
		out.println("Servlet info: " + servlet.getServletInfo()+"<br>");
	}
        out.println("</body>");
        out.println("</html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        doGet(request, response);
    }


	private String getServerInfoName(String serverInfo)
	{
	int slash = serverInfo.indexOf('/');
	if (slash == -1)
		return serverInfo;
	else 
		return serverInfo.substring(0, slash);
	}

	private String getServerInfoVersion(String serverInfo)
	{
	int slash = serverInfo.indexOf('/');
	if (slash == -1) 
		return null;
	else 
		return serverInfo.substring(slash + 1);
	}

}