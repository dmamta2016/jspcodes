<%-- 
    Document   : login.jsp
    Author     : vincent
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <div style="height:500px;width:1200px;">
            <img src="images.jpeg;" height="100px" width="180px"align="left"/>
            <br><br>
            <h2> Experience the Shopping....</h2>
            <hr>
            <div style="height:50px;width:400px;float:left;">

                <p><font color="blue" size="3" face="Times New Roman">
                <H4>
                    This is a simple HTML based Website for shopping the products online.
                    The Website uses Model-View-Controller architecture to authenticate
                    customers, thus segregating the presentation and data.
                    <br> <br>
                    The Website allows payment processing, shipping, and ordering 
                    to be performed on a single page without making customers to leave the Website.
                </H4></font>    
                </p>
            </div>

            <div style="position:relative;float:right;margin-top:-10px; ">
                <h1><center>Login Authentication</center></h1>
                <div style="display:block;background-color:bisque;width:350px;height:150px;">    
                    <form method="post" action="LoginServlet"> <br><H3>
                            &nbsp;&nbsp; Enter Username: <input type="text" name="username"> <BR> <BR>
                            &nbsp;&nbsp; Enter password : <input type="password" name="password"><br><br>
                            &nbsp;&nbsp;<input type="submit" value="    Login    "/></H3>
                </div> 
                </form>

            </div>
        </div>
    </body>
</html>
