Slip18.html
<html>
<form method="post" action="slip18.jsp">
Enter name:<input type="text" name="name">
Enter age:<input type="text" name="age">

<input type="submit" value="Check">
</form>
</html>
Slip18.jsp	
<html>
	<body>
		<font color=red>
		<%
			String name=request.getParameter("name");
			String age=request.getParameter("age");

			int ag=Integer.parseInt(age);
			if(ag>=18)
				out.println("voter is eligiable for voting");
			else
				out.println("voter is not eligiable for voting");
			
		%>
</font>
</body>
</html>
