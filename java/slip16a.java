Index.html
<html>
<head>
<title>Login Page</title>
</head>
<body>
<form action="checkdetails.jsp">
<legend>Enter User Id and Password...!!!</legend>
UserId: <input type="text" name="id" /> <br><br>
Password: <input type="text" name="pass" /> <br><br>
<input type="submit" value="Sign In!!"/>
</div>
</form>
</body>
</html>

Checkdetails.jsp
<html>
<head>
<title>Check Credentials</title>
</head>
<body>
<%
        String uid=request.getParameter("id");
        String password=request.getParameter("pass");
        session.setAttribute("session-uid", uid);
        if(uid.equals("Sofiya") && password.equals("Shaikh"))
        {
			response.sendRedirect("success.jsp");
        }
        else
		{
            response.sendRedirect("failed.jsp");
        }
        %>
</body>
</html>

Success.jsp
<html>
<head><title>Success Page</title></head>
<body>
<%
        String data=(String)session.getAttribute("session-uid");
        out.println(" Login Successfully...!!!");
        %>
</body>
</html>

Failed.jsp
<html>
<head><title>Sign-in Failed Page</title></head>
<body>
<%
        String data2=(String)session.getAttribute("session-uid");
        out.println(" User Id and Password are wrong. Please try Again.");
        %>
</body>
</html>