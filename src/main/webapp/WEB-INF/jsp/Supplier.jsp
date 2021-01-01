<%--
  Created by IntelliJ IDEA.
  User: Asha
  Date: 9/12/2020
  Time: 11:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
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
        <div class="col-sm-10">
            <p> <h1 style="text-align: left">Create Supplier</h1></p>
            <div class="row">
            <sform:form method="POST" modelAttribute="supplier" id="supplierform">
           <div class="col-md-5">
            <label for="firstName">First Name:</label>
            <sform:input type="firstName" class="form-control" id="firstName" placeholder="Enter First Name" path="firstName"/>
            <label for="email">Email:</label>
            <sform:input type="email" class="form-control" id="email" placeholder="Enter Email" path="email" />
        </div>
        <div class="col-md-5">
            <label for="lastName">Last Name:</label>
            <sform:input type="lastName" class="form-control" id="lastName" placeholder="Enter Last Name" path="lastname"/>
            <label for="mobile">Mobile:</label>
            <sform:input type="mobile" class="form-control" id="mobile" placeholder="Enter Mobile number" path="mobile"/>
        </div>
                <br>
            <br>
            <div class="col-md-10">
            <div class="row">
                <button type="submit" class="btn btn-default" >Submit</button>
                <button type="cancel" class="btn btn-default" >Cancel</button>
            </div>
                </div>
    </div>
</sform:form>
    </div>
</div>
</div>
</body>
</html>
