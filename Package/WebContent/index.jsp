<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Login Form</title>
    </head>
    <body><center>
        <table>
        <tr><td><h2><center>Hello, please log in:</center></h2></td></tr>
        <form name="loginForm" method="POST" action="Login_page">
            <p>
            <tr><td>
            <strong>User name:</strong>
                <input type="text" name="j_username" size="25">
                </p>
            </td></tr>
<tr><td>        <p>    <strong>Password : </strong>
                <input type="password" size="25" name="j_password">
                </p></td></tr>
           <tr><td> <p><center>
                <center><input type="submit" value="Submit"/>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                <input type="reset" value="Reset"/><br></center></td></tr></p><p>
<tr><td>                &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href="forgot_password.jsp">Forgot Password?</a>
                &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                <a href="create_user.jsp">New User?</a></td></tr>
                </p>
        </form> 
      </center>
              
    </body>
</html>