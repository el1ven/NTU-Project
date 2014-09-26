<%--
  Created by IntelliJ IDEA.
  User: el1ven
  Date: 19/9/14
  Time: 9:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html ng-app>
<head>
    <title>register界面</title>
    <link href="bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="bootstrap/css/bootstrap-theme.css" rel="stylesheet">
    <link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
    <script src="bootstrap/js/angular.js"></script>
</head>
<body>
注册界面：<hr><br>
<form name="registerForm" action="register.action" method="post">
    UserName:<input type="text" name="userName" required/><br><br>
    Password:<input type="text" name="userPassword" required/><br><br>
    UserType:
    <select name="userType">
        <option value="FM">FacultyMember</option>
        <option value="RSO">RSO</option>
        <option value="SRO">SRO</option>
    </select><br><br>
    UserEmail:<input type="email" name="userEmail" required/><br><hr>
    <input type="submit" value="submit"/>
    <input type="reset" value="reset"/>
</form>
</body>
</html>
