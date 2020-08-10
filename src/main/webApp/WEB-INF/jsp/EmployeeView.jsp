<%--
  Created by IntelliJ IDEA.
  User: Asha
  Date: 3/14/2020
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet"/>
    <title>List of Employees</title>
</head>
<body>
    <div class="generic-container">
        <div class="panel-heading">List of Employees</div>
        <table class="table table-hover" >
           <thead>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>NIC</th>
                <th>Mobile</th>
                <th>Birthday</th>
                <th width="100"></th>
                <th width="100"></th>
            </tr>
           </thead>

            <tbody>
            <!-- for loop gets value from employeeList and will put it into emp -->
            <c:forEach items="${employeeList}" var="emp">
                <tr>
                    <td>${emp.firstName}</td>
                    <td>${emp.lastName}</td>
                    <td>${emp.nic}</td>
                    <td>${emp.mobile}</td>
                    <td>${emp.dob}</td>
                    <td><a href="<c:url value='/edit-employee-${emp.id}'/>" class="btn btn-warning">Edit</a>  </td>
                    <td><a href="<c:url value='/delete-employee-${emp.id}'/>" class="btn btn-danger" >Delete</a>  </td>


                </tr>

            </c:forEach>
            </tbody>


        </table>
    </div>
<div class="panel">
    <a href="<c:url value='/newemployee'/>" class="btn btn-default">Add new employee</a>
</div>
</body>
</html>
