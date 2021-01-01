<%--
  Created by IntelliJ IDEA.
  User: Asha
  Date: 12/14/2020
  Time: 3:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>New customer</title>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
<div class="row">
            <div class="col-md-12">
                <jsp:include page="TopBar.jsp"></jsp:include>
                <div class="col-md-2">
                    <jsp:include page="LeftMenu.jsp"></jsp:include>
                </div>
        <div class="col-sm-10">
            <p><h1 style="text-align: center">Customer Registration</h1></p>
            <sform:form method="POST" modelAttribute="customer" id="customerform">
            <div class="col-md-5">
                <label for="firstName">First Name:</label><br>
                <sform:input type="firstName" class="form-control" id="firstName" placeholder="Enter First Name" path="firstName"/>
                <label for="email">Email:</label><br>
                <sform:input type="email" class="form-control" id="email" placeholder="Enter Email" path="email" />
                <label for="Address">Address:</label><br>
                <sform:input type="address" class="form-control" id="address" placeholder="Enter address" path="address" />
            </div>
            <div class="col-md-5">
                <label for="lastName">Last Name:</label><br>
                <sform:input type="lastName" class="form-control" id="lastName" placeholder="Enter Last Name" path="lastname"/>
                <label for="mobile">Mobile:</label><br>
                <sform:input type="mobile" class="form-control" id="mobile" placeholder="Enter Mobile number" path="mobile"/>
                <label for="nic">NIC:</label><br>
                <sform:input type="nic" class="form-control" id="lastName" placeholder="Enter your NIC" path="nic"/>

            </div>
            <br>
            <br>
            <div class="col-md-10">
                <div class="row">
                    <br>
                    <br>
                    <br>
                    <br>
                    <button type="submit" class="btn btn-default" >Submit</button>
                    <button type="cancel" class="btn btn-default" >Cancel</button>
                </div>
            </div>
        </div>
        </sform:form>
    </div>
</div>
</body>
</html>
