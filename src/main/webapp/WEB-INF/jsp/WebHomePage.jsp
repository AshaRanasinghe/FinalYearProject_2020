<%--
  Created by IntelliJ IDEA.
  User: Asha
  Date: 11/14/2020
  Time: 1:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Homepage</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <title>Homepage</title>

    <style >
        .container {
            position: relative;
            text-align: center;
            color: white;
        }
        .centered {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
        }
        #img{
            height: 600px;
            width: 1470px;
            object-fit: cover;

        }
        footer .glyphicon {
            font-size: 20px;
            margin-bottom: 20px;
            color: #f4511e;
        }
        page-footer{
            background-color: black;
        }
        #content1{


        }
        #box2{
            background-color: #2da9ad;
            opacity: 50%;
            margin-left: 100px;


        }
        #para{
            margin-left: 100px;
            margin-right: 100px;
            margin-top: 100px;
            margin-bottom: 100px;
            text-align: center;
        }
    </style>
</head>
<body>
<div>
    <nav class="navbar navbar-expand-sm bg-light">
        <ul class="navbar-nav">
            <li class="nav-item">
                <a class="nav-link" href="#">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">About us</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Our Products</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="#">Contact us</a>
            </li>
        </ul>
</div>
<div>
    <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
            <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
            <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
        </ol>
        <div class="col-md-12">
            <div id="img">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <div class="centered" id="img"><h1>Love life control</h1></div>
                        <img class="d-block w-100" src="images/home1.jpg" alt="First slide" id="img">
                    </div>
                    <div class="carousel-item">
                        <div class="centered" id="img"><h1>Centered</h1></div>
                        <img class="d-block w-100"  src="images/home2.jpg" alt="Second slide" id="img">
                    </div>
                </div>
                <div class="carousel-item">
                    <div class="centered" id="img"><h1>Centered</h1></div>
                    <img class="d-block w-100" src="images/home3.jpg" alt="Third slide" id="img">
                </div>
            </div>
            <div class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="sr-only">Previous</span>
            </div>
            <div class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="sr-only">Next</span>
            </div>
        </div>
    </div>
</div>
</div>
</div>
<br>
<div id="content1">
    <p id="para">"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
</div>
</div>
<div>
    <jsp:include page="WebFooterPage.jsp"></jsp:include>

</div>
</body>
</html>
