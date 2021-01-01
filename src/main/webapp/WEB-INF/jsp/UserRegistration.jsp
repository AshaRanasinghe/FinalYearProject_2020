<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Asha
  Date: 10/17/2020
  Time: 8:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration</title>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet"/>
    <title>Supplier</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css">
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
    <link href="<c:url value='/css/app.css'/>"/>
</head>
<body>
<div class="row">
    <div class="col-md-12">
        <jsp:include page="TopBar.jsp"></jsp:include>
        <div class="col-md-2">
            <jsp:include page="LeftMenu.jsp"></jsp:include>
        </div>
        <div class="generic-container">
            <div class="Well lead">User</div>
            <sform:form method="post" id="loginform" modelAttribute="user">

            <div class="row">
                <div class="form-group col-md-12">

                    <label class="col-md-3 control-label" for="employee">Employee: </label>
                    <div class="col-md-5">
                        <sform:select path="employee" items="${employeeList}" multiple="false" itemValue="id" itemLabel="fullName"
                                      class="form-control input-sm"/>
                        <div class="has-error">
                            <sform:errors path="employee" class="help-inline"/>
                            </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <label class="col-md-3" control-lable for="username"> User Name: </label>
                <div class="col-md-5">
                        <sform:input type="text" path="username" id="username" class="form-control input-sm"></sform:input>
                </div>
            </div>
            <div class="row">
                <label class="col-md-3" control-lable for="password"> Password: </label>
                <div class="col-md-5">
                    <sform:input type="password" path="password" id="password" class="form-control input-sm"></sform:input>
                </div>
            </div>
            <div class="row">
            <label class="col-md-3" control-lable for="password"> Confirm Password: </label>
            <div class="col-md-5">
                <sform:input type="password" path="confirmPassword" id="password" class="form-control input-sm"></sform:input>
            </div>
        </div>
            <div class="row">
                <div class="form-group col-md-12">

                    <label class="col-md-3" control-lable for="role"> Role: </label>
                    <div class="col-md-5">
                        <sform:select path="role" items="${roleList}" multiple="false" itemValue="id"
                                      itemLabel="name" class="form-control input-sm"/>
                        <div class="has-error">
                            <sform:errors path="role" class="help-inline"/>
                        </div>
                    </div>'''                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       </div>
            </div>
            </sform:form>

            <div class="row">
                <div class="col-md-5">
                    <input id="submitbutton" type="submit" value="save" class="btn btn-primary btn-sm"/>&nbsp;
                    href="<c:url value='/' />" class="btn btn-warning">Cancel</a>
                </div>
            </div>
</body>
</html>
