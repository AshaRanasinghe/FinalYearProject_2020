<%--
  Created by IntelliJ IDEA.
  User: Asha
  Date: 6/29/2020
  Time: 4:11 PM
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
          rel="stylesheet"/>
    <link href="<c:url value='/css/app.css' />" rel="stylesheet"></link>
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

    <title>Login Form</title>
</head>

<body>

<div class="generic-container">
    <div class="well lead">System Login</div>
    <sform:form  method="post" id="loginform" modelAttribute="user">
    <div class="row">
        <div class="form-group col-md-12">
            <label class="col-md-3 control-lable" for="username">User Name : </label>
            <div class="col-md-5">
                <sform:input type="text" path="username" id="username"
                             class="form-control input-sm"></sform:input>
            </div>
            <div class="has-error col-md-5">
                <sform:errors path="username" class="help-inline"/>
            </div>
        </div>
    </div> <div class="row">
    <div class="form-group col-md-12">
        <label class="col-md-3 control-lable" for="password">Password : </label>
        <div class="col-md-5">
            <sform:input type="password" path="password" id="password"
                         class="form-control input-sm"></sform:input>
        </div>
        <div class="has-error col-md-5">
            <sform:errors path="password" class="help-inline"/>
        </div>
    </div>
</div>
</div>
</div>
<div class="row">
    <div class="form-group col-md-12">
        <div class="col-md-5">

            <input type="submit" value="Login" class="btn btn-primary btn-sm"/>


        </div></div></div>

</sform:form>

</div>
</body>
</html>
