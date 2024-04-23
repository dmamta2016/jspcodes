<%-- 
    Document   : success
    Author     : vincent
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success Page</title>
    </head>
    <body>
<img src="new golf.jpg"" />
        <h3> Welcome
            <% out.print(request.getAttribute("name")+"!");%>
			you can enroll as a member in the Club.
        </h3>
    </body>
</html>
