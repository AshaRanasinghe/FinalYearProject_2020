        <%--
          Created by IntelliJ IDEA.
          User: Asha
          Date: 9/16/2020
          Time: 9:09 PM
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
            <link href="<c:url value='/css/ViewTablesStyles.css'/>"/>
            <title>List of Suppliers</title>

            <style>
                ul.breadcrumb {
                    padding: 10px 16px;
                    list-style: none;
                }
                ul.breadcrumb li {
                    display: inline;
                    font-size: 10px;
                }
                ul.breadcrumb li+li:before {
                    padding: 8px;
                    color: black;
                    content: "/\00a0";
                }
                ul.breadcrumb li a {
                    color: #0275d8;
                    text-decoration: none;
                }
                ul.breadcrumb li a:hover {
                    color: #01447e;
                    text-decoration: underline;
                }
            </style>

        </head>
        <body>
        <div class="col-md-12">
            <jsp:include page="TopBar.jsp"></jsp:include>
            <div class="col-md-2">
                <jsp:include page="LeftMenu.jsp"></jsp:include>
            </div>
                <div class="col-sm-10">

                    <dev class="row">
                        <ul class="breadcrumb">
                            <li><a href="/Dashboard/admin">DashBoard</a></li>
                            <li><a href="/supplierController/Supplier">SupplierManagement</a></li>
                        </ul>
                    </dev>
                    <p> <h1 style="text-align: left">Supplier Management</h1></p>
                    <div class="row">
                        <a href="/supplierController/newSupplier"><button type="button" class="btn btn-success" style="margin-left: 1111px;">Create New</button></a>

                    </div>
                    <table class="table table-hover" >
                        <thead>
                        <tr>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Email</th>
                            <th>Mobile</th>
                            <th width="100"></th>
                            <th width="100"></th>
                        </tr>
                        </thead>
                        <tbody>
                        <!-- for loop gets value from employeeList and will put it into emp -->
                        <c:forEach items="${supplierList}" var="sup">
                            <tr>
                                <td>${sup.firstName}</td>
                                <td>${sup.lastname}</td>
                                <td>${sup.email}</td>
                                <td>${sup.mobile}</td>
                                <td><a href="<c:url value='/supplierController/edit-supplier-${sup.id}'/>" class="btn btn-warning">Edit</a>  </td>
                                <td><a href="<c:url value='/supplierController/delete-supplier-${sup.id}'/>" class="btn btn-danger" >Delete</a>  </td>
                            </tr>

                        </c:forEach>
                        </tbody>
                    </table>
                <div class="panel" id="pages">

                </div>

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
