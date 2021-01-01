<%--
  Created by IntelliJ IDEA.
  User: Asha
  Date: 6/29/2020
  Time: 4:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>

    <title>Login Form</title>
    <!--<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">-->

    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet"/>
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


    <style>
      #leftside{
          height:100%;
          background-color: #1596aa;

      }
       #rightside{
           height:750px;
           background:url("/images/leftImage.jpg");
           width: 100%;


       }
    input[type=text]{
        -webkit-border-radius: 20px;
        -moz-border-radius: 20px;
        border-radius: 20px;
        border: 1px solid #2d9fd9;
        color: #a0d18c;
        width: 250px;
        height: 30px;
        padding-left: 10px;
    }
    input[type=password]{
        -webkit-border-radius: 20px;
        -moz-border-radius: 20px;
        border-radius: 20px;
        border: 1px solid #2d9fd9;
        color: #a0d18c;
        width: 250px;
        height: 30px;
        padding-left: 10px;
        margin-top: 10px;
    }

    input[type=text]:focus {
        outline: none;
        border: 1px solid #a0d18c;
        color: #2d9fd9;
    }

    input[type=password]:focus {
        outline: none;
        border: 1px solid #a0d18c;
        color: #2d9fd9;
        border-radius: 40px;
    }
    label {
        color: white;
        font-weight: bold;
        display: block;
        width: 150px;
        float: left;
        font-size: medium;
        alignment: left;
    }
    label:after { content: ": " }
   .btn-sm{
       height: 20px;
       width: 90px;
       margin-left: 100px;
       border-radius: 50px;
   }
    h1{
        margin-top: 150px;
        text-align: center;
        font-family: "Gloucester MT Extra Condensed";
    }
   </style>
</head>
<body >

    <div class="col-md-5" id="leftside" >

        <sform:form  method="post" modelAttribute="user">

        <div class="generic-container">
            <h1>CYRUS INFRMATION TECHNOLOGIES</h1>
            <label class="col-md-3 control-lable" for="username" id="name" style="margin-top: 100px;">User Name</label>
            <div class="col-md-5">
                <sform:input type="text" path="username" id="username" class="form-control" style="align-self: center" Style="margin-top: 100px" />
            </div>
            <div class="has-error col-md-5">
                <sform:errors path="username" class="help-inline" id="nametext"/>
            </div>
            <!--<div class="row"> -->
    <div class="form-group col-md-12">
        <label class="col-md-3 control-lable" for="password" id="password">Password</label>
        <div class="col-md-5">
            <sform:input type="password" path="password" id="password" class="form-control input-sm" style="align-self: center" />
        </div>
        <div class="has-error col-md-5">
            <sform:errors path="password" class="help-inline" />
        </div>
    </div>
        </div>
           <div class="col-md-4">
                </div>
    <div class="form-group col-md-6">
        <div class="col-md-5">
            <input type="submit" value="Login" class="btn btn-primary btn-sm" />
        </div>
        </div>
            </sform:form>
    </div>

    <dev class="col-md-7" id="rightside" >



    </dev>

    <script>
        $(document).ready(function(){
            $(".btn-primary:first").click(function(){
                $(this).button('toggle');
            });
        });
    </script>
</body>
</html>
