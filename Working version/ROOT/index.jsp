<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
   <body>
<img src="golf.jpg" />
<br>Experience the Joy of Golfing...
<br>
<h1>Age Verification</h1>
<form method="post" action="/AgeServlet"> <br>
Enter Your Name: <input type="text" name="name"> <BR> <BR>
Enter Age: <input type="text" name="age"><br><br>
<input type="submit" value="Submit"/>
        </form>
	</body>
</html>
