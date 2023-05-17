Slip3a.html
<html>
<body>
<h2>Page1</h2>
<form method="GET" action="slip3a.jsp">
<input type=checkbox name="item" value=200>BOOK(200)<br>
<input type=checkbox name="item" value=150>CD(150)<br>
<input type=checkbox name="item" value=220>SOFTTOY(220)<br><br>
<input type=submit value="SUBMIT">
<input type=reset>
</form>
</body>
</html>
Slip3a.jsp
<html>
<body>
<% 
int sum=0;
String []values=request.getParameterValues("item");
if(values!=null)
{
	for(int i=0;i<values.length;i++)
	{
		sum=sum+Integer.parseInt(values[i]);
	}
}
session.setAttribute("p1",sum);
response.sendRedirect("slip3b.html");
%>
</body>
</html>
Slip3b.html
<html>
<body>
<h2>Page2</h2>
<form method="GET" action="slip3b.jsp">
<input type=checkbox name="item" value=12000>PRINTER(12000)<br>
<input type=checkbox name="item" value=220>PENDRIVE(220)<br>
<input type=checkbox name="item" value=1200>RAM(1200)<br><br>
<input type=submit value="SUBMIT">
<input type=reset>
</form>
</body>
</html>
Slip3b.jsp
<html>
<body>
<% 
int sum1=((Integer)session.getAttribute("p1")).intValue();
int sum2=0;
String []values=request.getParameterValues("item");
if(values!=null)
{
	for(int i=0;i<values.length;i++)
	{
		sum2=sum2+Integer.parseInt(values[i]);
	}
}
int total=sum1+sum2;
out.println("<html>");
out.println("<h2>Summary</h2>");
out.println("sum of Page 1:   "+sum1);
out.println("<br>");
out.println("Sum of Page 2:   "+sum2);
out.println("<br>");
out.println("Total Bill"+total);
out.println("</body>");
out.println("</html>");
%>
</body>
</html>