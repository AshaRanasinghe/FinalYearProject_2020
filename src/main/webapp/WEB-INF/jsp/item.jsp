<%--
  Created by IntelliJ IDEA.
  User: Ahsan
  Date: 9/26/2020
  Time: 11:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sform"
           uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Item Form</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

    <style>


        body{width:610px;}
        .frmSearch {border: 1px solid #a8d4b1;background-color:
                #c6f7d0;margin: 2px 0px;padding:40px;border-radius:4px;}
        #categories{float:left;list-style:none;margin-top:-3px;padding:0;width:190px;
            position: absolute;}
        #categories li{padding: 10px; background: #f0f0f0; border-bottom: #bbb9b9 1px solid;}
        #categories li:hover{background:#ece3d2;cursor: pointer;}
        #itemname{padding: 10px;border: #a8d4b1 1px solid;border-radius:4px;}

    </style>
</head>
<body>
<sform:form method="POST" modelAttribute="item">
    <div class="frmSearch">
        <div class="row">
            <div class="col-md-2">CategoryController
                <sform:label path="categoryObj">Item Category</sform:label>
            </div>
            <div class="col-md-2">
                <sform:input path="categoryObj" type="text" id="itemname"/>
            </div>
        </div>
        <div class="row">
            <div class="col-md-2"></div>
            <div class="col-md-2">
                <div id="categoryList"></div>
            </div>
        </div>
    </div>
</sform:form>
</body>
</html>


<script>

    $(document).ready(function () {

        $("#itemname").keyup(function () {

            var value = $("#itemname").val();

            var contents = [iname=value];

            var jsonData = {json:JSON.stringify(contents)};


            $.ajax({
                type:'GET',
                url:'/retrievecategory',
                data:jsonData,
                dataType:'json',
                success:function (data) {

                    $("#categoryList").show();
                    var items = "<ul id='categories'>";
                    $.each(data, function (key, value) {

                        items = items + '<li onClick="selectCategory('+value.name+');">' + value.name + "</li>";
                    });

                    items = items + "</ul>";
                    $("#categoryList").html(items);
                }
            });
        });


    });

    function selectCategory(value){


        $("#itemname").val(value);
        $("#categoryList").hide();

    }


</script>




















