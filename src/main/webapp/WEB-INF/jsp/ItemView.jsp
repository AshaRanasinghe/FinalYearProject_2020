<%--
  Created by IntelliJ IDEA.
  User: Asha
  Date: 9/22/2020
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Item Management</title>
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
<div class="col-md-12">
    <jsp:include page="TopBar.jsp"></jsp:include>
    <div class="col-md-2">
        <jsp:include page="LeftMenu.jsp"></jsp:include>
    </div>
    <div class="col-sm-10">
        <p>Supplier Management</p>
        <div class="row">
            <button type="submit" class="btn btn-default">New Item </button>
        </div>

        <!--table-->
        <table class="table table-hover" >
            <thead>
            <tr>
                <th>Main Category</th>
                <th>Sub Category</th>
                <th>Number</th>
                <th>Name</th>
                <th>Barcode</th>
                <th>Selling Price</th>
                <th>Buying Price</th>
                <th width="100"></th>
                <th width="100"></th>
            </tr>
            </thead>
            <tbody>
            <!-- for loop gets value from employeeList and will put it into emp -->
            <c:forEach items="${itemList}" var="item">
                <tr>
                    <td>${item.maincat}</td>
                    <td>${item.subcat}</td>
                    <td>${item.number}</td>
                    <td>${item.name}</td>
                    <td>${item.barcode}</td>
                    <td>${item.sellingPrice}</td>
                    <td>${item.buyingPrice}</td>
                    <td><a href="<c:url value='/ItemController/edit-item-${item.id}'/>" class="btn btn-warning">Edit</a>  </td>
                    <td><a href="<c:url value='/ItemController/delete-supplier-${item.id}'/>" class="btn btn-danger" >Delete</a>  </td>
                </tr>

            </c:forEach>
            </tbody>
        </table>

    </div>
</div>

</body>
</html>
