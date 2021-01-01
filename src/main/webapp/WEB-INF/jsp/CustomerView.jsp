<%--
  Created by IntelliJ IDEA.
  User: Asha
  Date: 12/19/2020
  Time: 10:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LIst of Customers</title>
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
<div class="generic-container">
    <div class="panel-heading"><h1 style="text-align: center">Customer Management</h1></div>
    <table class="table table-hover" >
        <thead>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>NIC</th>
            <th>Email</th>
            <th>Mobile</th>
            <th width="100"></th>
            <th width="100"></th>
        </tr>
        </thead>
        <tbody>
        <!-- for loop gets value from employeeList and will put it into emp -->
        <c:forEach items="${customerList}" var="cus">
            <tr>
                <td>${cus.firstName}</td>
                <td>${cus.lastname}</td>
                <td>${cus.nic}</td>
                <td>${cus.email}</td>
                <td>${cus.mobile}</td>
                <td><a href="<c:url value='/edit-customer-${cus.id}'/>" class="btn btn-warning">Edit</a>  </td>
                <td><a href="<c:url value='/delete-customer-${cus.id}'/>" class="btn btn-danger" >Delete</a>  </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<div class="panel">
    <a href="<c:url value='/newCustomer'/>" class="btn btn-default">Add new employee</a>
</div>
</body>
</html>

<script>
    $(document).ready(function() {
        pagination();
    });
    function pagination() {
        var no_of_raws = 5; //how many pages are there for one page
        var $rows = $("tbody tr"); //count td in tbody
        var total_data_raws = $rows.length; //take the lenght of the tbody td

        var no_of_pages = 0;

        if (total_data_raws%no_of_raws == 0) {
            no_of_pages = total_data_raws / no_of_raws;
        }
        if (total_data_raws % no_of_raws >= 1) {
            no_of_pages=total_data_raws/no_of_raws;
            no_of_pages++;
        }
        for (var i = 1; i<= no_of_pages; i++) {
            $("#pages").append("<a href='#' " +
                "style='color: black;\n" +
                "  float: left;\n" +
                "  padding: 8px 16px;\n" +
                "  text-decoration: none;" +
                "display: inline-block;" +
                "border: 1px solid #ddd;'>"+i+"</a>");
        }
        $rows.each(function (j) {
            $(this).hide();
            if(j+1<=no_of_raws){
                $rows.eq(j).show();
            }
        });
        $("#pages a").click(function (e){
            e.preventDefault();
            $rows.hide();

            var page=$(this).text();
            var temp=page-1;

            var start = temp * no_of_raws;

            for (var a = 0;a<no_of_raws;a++) {
                $rows.eq(start+a).show();
            }

        });
    }
</script>

