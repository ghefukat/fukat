Slip5.html
<html>
      <head>
            <title> Slip 5
            </title>
	  </head>
	  <body>
	  <form name="f1" method="post" action="slip5.jsp">
	  Enter The Number:<input type="text" name="tname"><br>
	 <input type="submit" name="s1" value="Show">
	 
</form>


 </body>
</html>

Slip 5.jsp

<html>
	<body>
		<font color="red" size="18">
		<%
			int n=Integer.parseInt(request.getParameter("tname"));
			int ld=n%10;
			while(n>9)
				n=n/10;
			
			int fd=n;
			int sum=fd+ld;
			out.println(sum);
			
		%>
		</font>
	</body>
</html>
Web.xml
<web-app>
 <welcome-file-list>
	<welcome-file>slip5.html</welcome-file>
 </welcome-file-list>
</web-app>