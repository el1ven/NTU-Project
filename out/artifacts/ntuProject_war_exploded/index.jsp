<%--
  Created by IntelliJ IDEA.
  User: el1ven
  Date: 19/9/14
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html ng-app>
<head>
    <title>index</title>
    <link href="bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="bootstrap/css/bootstrap-theme.css" rel="stylesheet">
    <link href="bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">
    <script src="bootstrap/js/angular.js"></script>
    <script>
        function loginController($scope, $http){
            $scope.loginFormData = {};
            $scope.processLoginFormData = function(){
                //alert($scope.loginFormData.userPassword);
                $http.post('verify.action', $scope.loginFormData).success(function(data){
                    if(data == "fail"){
                        alert('Not register!');
                    }else{
                        alert('Success!');
                    }
                });
            };
        }
    </script>
</head>
<body>
登录界面：
<hr/><br/>
<form name="loginForm" action="login.action" method="post">
    UserName:<input type="text" name="userName" required/><br><br>
    Password:<input type="password" name="userPassword" required/><br><br>
    <input type="submit" value="Submit"/>
    <input type="reset" value="Reset"/>
</form>
<a href="register.jsp">Click here to register!</a>
</body>
</html>

