<%--
  Created by IntelliJ IDEA.
  User: Asha
  Date: 11/17/2020
  Time: 12:40 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    <title>Dashboard</title>

    <style>
        body {
            background-image: url("/images/Backgrount_img.jpg");
            height: 100%;
            width: 100%;
        }
        .c-i-dash-card{
            background: #ffffffbf;
            text-align: center;
            min-height: 150px;
            padding: 30px 10px;
            color: #1963ea;
            text-transform: uppercase;
            font-size: 25px;
            border-radius: 15px;
            box-shadow: 0px 16px 27px -30px #0000002e;

        }
        #dcard{
            height: 70px;
            width: 350px;
        }
        .heading{
            margin-top: 50px;
            position: absolute;
            left: 50%;
            margin-right: -50%;
            transform: translate(-50%, -50%);
        }
        .bigbox{
            margin-top:120px ;
        }
    </style>
</head>
<body>

<div class="col-md-12">
    <jsp:include page="TopBar.jsp"></jsp:include>
    <div class="col-md-2">
        <jsp:include page="LeftMenu.jsp"></jsp:include>
    </div>
    <div class="col-md-10">
        <div class="heading" >
            <h2>Cyrus Information system</h2>
        </div>
        <br>
        <div class="bigbox">
            <div class="row">
            <div class="col-md" >
                <div class="c-i-dash-card" id="dcard">
                    <a href="/employee"><p>Employee Management</p></a>
                </div>
            </div>
                <div class="col-md">
                    <div class="c-i-dash-card" id="dcard">
                        <a href="/supplierController/Supplier"><p>Supplier Management</p></a>
                    </div>
                </div>
                <div class="col-md">
                    <div class="c-i-dash-card" id="dcard">
                        <a href="/pocontroller/neworder"><p>Purchase Order Management</p></a>
                    </div>
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col-md">
                    <div class="c-i-dash-card" id="dcard">
                       <p>Invoices</p></a>>
                    </div>
                </div>
                <div class="col-md">
                    <div class="c-i-dash-card" id="dcard">
                        <p>Good Receive Notes</p></a>
                    </div>
                </div>
                <div class="col-md">
                    <div class="c-i-dash-card" id="dcard">
                        <a href="/customer"><p>Customer Management</p></a>
                    </div>
                </div>
            </div>
            </div>
    </div>
</div>
</body>
</html>
