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
        
        <h1> Welcome:
            <% out.print(request.getAttribute("user")); %>
        </h1>
    </body>
</html>
