<%--
  Created by IntelliJ IDEA.
  User: Asha
  Date: 7/25/2020
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet"/>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <!--  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>-->
    <link href="<c:url value='/css/app.css'/>"/>

    <title>Admin Panel</title>

    <style>
        #wrapper {
            display:flex;
            width:100%;
            align-items:stretch;}

        #sidebar {
            min-width:250px;
            max-width:250px;
            min-height: 100vh;
            background: #7386D5;
            color: #fff;
            transition: all 0.3s;
        }

        #sidebar .sidebar-header {
            padding: 20px;
            background: #6d7fcc;
        }

        #sidebar ul.components{
            padding: 20px 0;
            border-bottom: 1px solid #47748b;
        }

        #sidebar ul li a {
            padding: 10px;
            font-size: 1.1em;
            display: block;
        }

        #sidebar ul li a:hover {
            color:#7386D5;
            background: #fff;

        }

    </style>

</head>
<body>
<div id="wrapper">
    <nav id="sidebar">
        <div class="sidebar-header">
        system options
        </div>
        <ul class="list-unstyled components">
            <li class="active"><a href="#">Dashboard</a></li>
            <li><a href="#">Dashboard</a></li>
            <li ><a href="#">Customer</a></li>
            <li><a href="#">Supplier</a></li>
            <li><a href="#">Purchase orders</a></li>
            <li><a href="#">Invoices</a></li>
        </ul>
    </nav>
    <nav id="content"></nav>
</div>

</body>
</html>