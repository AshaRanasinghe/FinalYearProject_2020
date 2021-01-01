<%--
  Created by IntelliJ IDEA.
  User: Asha
  Date: 9/21/2020
  Time: 3:19 PM
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
    <link href="<c:url value='/css/app.css'/>
    <link href="<c:url value='/css/backgroundImage.css'/>

</head>
<body>
  <div class="row">
    <div class="col-md-12">
        <jsp:include page="TopBar.jsp"></jsp:include>
        <div class="col-md-2">
            <jsp:include page="LeftMenu.jsp"></jsp:include>
        </div>
        <div class="col-sm-10">
            <p><h1>Item Registration</h1></p>
            <div class="row">
                <sform:form method="POST" modelAttribute="item" id="ItemRegForm">
                <sform:input path="categoryObj" type="text" id="itemname"/>
                    <!--main category-->
                        <div class="row">
                            <div class="form-group col-md-6">
                                <sform:label path="categoryObj">
                                    <label class="col-md-3 control-label" for="mainCategory">Main Category</label>
                                </sform:label>
                                <div class="col-md-9">
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
                    <!--sub category-->
            <div class="row">
                <div class="col-md-6">
                    <sform:label path="subcatObj">
                        Sub Category
                    </sform:label>
                    <div class="col-md-9">
                        <sform:input path="subcatObj" type="text" id="itemname"/>
                    </div>
                    <div class="row">
                        <div class="col-md-2"></div>
                        <div class="col-md-2">
                            <div id="subcategoryList"></div>
                        </div>
                    </div>
                </div>
            </div>

                    <!--number-->
                    <div class="row">
                    <div class="form-group col-md-6">
                    <label class="col-md-3 control-label" for="number">Number</label>
                    <div class="col-md-9">
                    <sform:input type="text" path="number" id="nic" for="number" class="form-control input-sm"></sform:input>
                    <div class="has-error">
                    <sform:errors path="number" class="help-inline"/>
                    </div>
                    </div>
                    </div>
                    <div class="form-group col-md-6">
                    <label class="col-md-3 control-label" for="name">Name</label>
                    <div class="col-md-9">
                    <sform:input type="text" path="name" id="nic" for="name" class="form-control input-sm"></sform:input>
                    <div class="has-error">
                    <sform:errors path="name" class="help-inline"/>
                    </div>
                    </div>
                    </div>

                    <!--Barcode-->
                    <div class="row">
                    <div class="form-group col-md-6">
                    <label class="col-md-3 control-label" for="barcode">Barcode</label>
                    <div class="col-md-9">
                    <sform:input type="text" path="barcode" id="nic" for="barcode" class="form-control input-sm"></sform:input>
                    <div class="has-error">
                    <sform:errors path="barcode" class="help-inline"/>
                    </div>
                    </div>
                    </div>
                    <div class="form-group col-md-6">
                    <label class="col-md-3 control-label" for="SellingPrice">Selling price</label>
                    <div class="col-md-9">
                    <sform:input type="text" path="sellingPrice" id="SellingPrice" for="SellingPrice" class="form-control input-sm"></sform:input>
                    <div class="has-error">
                    <sform:errors path="sellingPrice" class="help-inline"/>
                    </div>
                    </div>
                    </div>

                    <!--Buying price-->
                    <div class="row">
                    <div class="form-group col-md-6">
                    <label class="col-md-3 control-label" for="buyingPrice">Buying price</label>
                    <div class="col-md-9">
                    <sform:input type="text" path="buyingPrice" id="buyingPrice" for="buyingPrice" class="form-control input-sm"></sform:input>
                    <div class="has-error">
                    <sform:errors path="buyingPrice" class="help-inline"/>
                    </div>
                    </div>
                    </div>
</div>
                    </div>
                    </div>
            <br>
            <div class="col-md-10">
                <div class="row">
                    <button type="submit" class="btn btn-default" >Submit</button>
                    <button type="cancel" class="btn btn-default" >Cancel</button>
                </div>
            </div>
                    </div>
            </sform:form>
        </div>
    </div>
    </div>
</head>
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

