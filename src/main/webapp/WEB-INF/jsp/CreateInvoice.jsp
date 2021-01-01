<%--
  Created by IntelliJ IDEA.
  User: Asha
  Date: 12/22/2020
  Time: 7:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New Invoice test</title>
</head>
<body>
<div class="row">
    <div class="col-md-12">
        <jsp:include page="TopBar.jsp"></jsp:include>
        <div class="col-md-2">
            <jsp:include page="LeftMenu.jsp"></jsp:include>
        </div>
        <div class="col-sm-10">
            <p><h1 style="text-align: center">Invoice Generation</h1></p>
            <sform:form method="POST" modelAttribute="invoice" id="invoiceform">
            <dev class="row">
                <ul class="breadcrumb">
                    <li><a href="/Dashboard/admin">DashBoard</a></li>
                    <li><a href="/supplierController/Supplier">Invoice Generation</a></li>
                <li><a href="/supplierController/Supplier">Invoice Generation</a></li>
                </ul>
            </dev>
            <p> <h1 style="text-align: left">Invoice Generation</h1></p>

            <dev class="row">
                <label for="InvNumber">Invoice Number:</label><br>
                <sform:input type="text" class="form-control" id="InvNumber" placeholder="Enter Invoice number" path="invoicenumber"/>
            </dev>

            <dev class="row">
                <div class="col-md-3">
                        <label for="senderName">Sender Name:</label><br>
                        <sform:input type="text" class="form-control" id="senderName" placeholder="Enter sender`s Name" path="senderName"/>

                        <label for="billingAddress">Billing Address:</label><br>
                        <sform:input type="textarea" class="form-control" id="billingAddress" placeholder="Enter billing Addresse" path="billingAddress"/>

                </div>

                    <div class="col-md-3">
                        <label for="senderemail">Sender Email:</label><br>
                        <sform:input type="text" class="form-control" id="senderemail" placeholder="Enter Sender Email" path="senderEmail"/>

                        <label for="term">Term:</label><br>
                        <sform:input type="text" class="form-control" id="term" placeholder="Enter Term" path="term"/>

                    </div>

                    <div class="col-md-4">
                        <label for="invdate">Invoice Date:</label><br>
                        <sform:input type="date" class="form-control" id="invdate" placeholder="Inv date" path="invoiceDate"/>

                        <label for="duedate">Due Date:</label><br>
                        <sform:input type="date" class="form-control" id="duedate" placeholder="Enter due date" path="dueDate"/>
                    </div>
                </dev>

            <div class="row">


            </div>


            </dev>
        </dev>
    </sform:form>
</body>
</html>
