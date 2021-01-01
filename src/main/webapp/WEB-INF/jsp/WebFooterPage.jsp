<%--
  Created by IntelliJ IDEA.
  User: Asha
  Date: 11/16/2020
  Time: 8:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <title>Footer</title>
    <style>
        .container{
            background-color: blue;
            margin-top: 20px;
            margin-bottom: 20px;
            margin-left: 10px;
            margin-right: 10px;


        }
        footer .glyphicon {
            font-size: 20px;
            margin-bottom: 20px;
            color: #f4511e;

        }
        footer.container-fluid{
            margin-top: 20px;
            margin-bottom: 20px;
        }
        .col-sm{
            font-family: sans-serif;
            font-size: 15px;
        }

    </style>
</head>
<body>
<div class="container">
    <div class="row"></div>
    <div class="row">
        <div class="col-sm">
            One of three column
            <div>Address: Old Kasbewa road, Delkanda, nugegoda</div>
            <div>Contact No: 0774062249 / 0112658926</div>
        </div>
        <div class="col-sm">
            <div>Home</div>
            <div>About us</div>
            <div>Products</div>
            <div>Contact us</div>
        </div>
        <div class="col-sm">
            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ac libero et libero mattis facilisis eget at quam. Nunc ac tellus sit amet nisl finibus venenatis. Etiam ac imperdiet sapien, eu condimentum elit.
        </div>
    </div>
    <!-- Footer -->
    <footer class="container-fluid text-center">
        <a href="#myPage" title="To Top">
            <span class="glyphicon glyphicon-chevron-up"></span>
        </a>
        <p>By Asha Ranasinghe <a href="https://www.w3schools.com" title="Visit w3schools">CYRUS IT (Pvt).Ltd</a></p>
    </footer>
</div>
</body>
</html>
