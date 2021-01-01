<%--
  Created by IntelliJ IDEA.
  User: Asha
  Date: 8/8/2020
  Time: 10:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "sform" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    .table_items {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }
    .head{
        padding-top: 10px;
        padding-left: 300px;
        padding-right: 500px;
        font-size: large;
        font-color:red;
        text-align: center;

    }
    .tbclass td{
        padding: 10px;
        border-bottom: aquamarine  1px solid;
    }
</style>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link rel="stylesheet" href="css/form.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<head>
    <title>Purchase Order Form</title>
</head>
<body>
<div class="row">
    <div class="col-md-12">
        <jsp:include page="TopBar.jsp"></jsp:include>
    </div>
        <div class="col-md-2">
            <jsp:include page="LeftMenu.jsp"></jsp:include>
        </div>
        <div class="col-md-7">
<!--<div class="graphic-container">-->
            <p id="head"><h1>Purchase Order Form</h1></p>
    <sform:form method="POST" modelAttribute="PurchaseOrder">
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-1 control-label"></label>
                <label class="col-md-2 control-label" for="PODate">Date:</label>
                <div class ="col-md-3"><sform:input path="PODate" type="date" id="PODate"/>
                </div>
                <label class="col-md-1 control-label"></label>
                <label class="col-md-2 control-label" for="PONumber">Purchase Order #:</label>
                <div class ="col-md-3"><sform:input path="PONumber" type="date" id="PONumber"/>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-1 control-label"></label>
                <div class="col-md-3">
                    <div class="table_items">
                    <button type="button" data-toggle="modal" data-target="#ItemModel" class="btn btn-info">Add more Items</button>
                    <div class="modal fade" id="ItemModel" role="form">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h3> Add Item To Purchase</h3>
                                </div>
                                <div class="modal-body">
                                    <sform:form modelAttribute="product" method="POST">
                                        <div>
                                            <label>Item</label>
                                        </div>
                                        <div>
                                            <sform:select path="item" items="${itemList}" itemValue="id" itemLabel="name" id="product"></sform:select>
                                        </div>
                                        <div>
                                            <label>Quantity</label>
                                        </div>
                                        <div>
                                            <sform:input path="quantity" type="text" id="quantity"/>
                                        </div>
                                    </sform:form>
                                </div>

                                    <div class="modal-footer">
                                        <button type="button" id="additem" class="btn btn-info">Add</button>
                                    </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
            </div>
        </div>


        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-1 control-label"></label>
                <!--<label class="">Item List</label>-->
                <div class="col-md-6">
                    <table>
                        <thead>
                        <tr>
                            <td>Item Name</td>
                            <td>Item Quantity</td>
                            <td>Price</td>
                            <td>Line Total</td>
                            <td>Remove</td>
                        </tr>
                        </thead>
                        <tbody>
                        <c:set var ="totalAmount" value="0"></c:set>
                        <c:forEach var="product" items="${sessionScope.pList.productList}">
                            <c:set var ="totalAmount" value="${totalAmount+product.lineTotal}">

                            </c:set>
                            <tr>
                            <td>${product.item.name}</td>
                            <td>${product.quantity}</td>
                            <td>${product.item.sellingPrice}</td>
                            <td>${product.lineTotal}</td>
                            <td><a href="#" class="btn btn-danger">Remove</a> </td>
                            </tr>
                        </c:forEach>
                        <tr>
                            <td colspan="3">Total Amount</td>
                            <td>
                                <sform:input readonly="true"  path="totalPrice" id="totalPrice" value="${totalAmount}"/>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    <div class="row">
        <div class="form-group col-md-12">
            <div class="col-md-10">
                <input type="button" id="btnsave" value="Save" class="btn btn-primary"/>
            </div>
        </div>
    </div>
</div>
</sform:form>
</div>
</body>
</html>

<script type="application/javascript">

    function AddItemAjaxCall() {
        var product = document.getElementById("product").value;
        var quantity = document.getElementById("quantity").value;
        var contents = [p=product,q=quantity];
        var jsonData = {json:JSON.stringify(contents)};
        $.ajax({
            type:'GET',
            url:'/pocontroller/additem',
            data:jsonData,
            dataType:'json',
            success:function (data) {
                location.reload();
            },
            error:function (data) {
                location.reload();
            }
        });

    }
    function savePurchaseOrderAjaxCall(){

        var poDate = document.getElementById("PODate").value;
        var poNumber = document.getElementById("PONumber").value;

        var total = document.getElementById("totalPrice").value;

        var contents = [pdate=poDate,pnum=poNumber,total=total];

        var jsonData = {json:JSON.stringify(contents)};

        alert("save button");
        $.ajax({
            type:'POST',
            url:'/pocontroller/neworder',
            data:jsonData,
            dataType:'json',
            success:function (data) {
                location.reload();
            },
            error:function (data) {
                location.reload();
            }

        });
    }


    $(document).ready(function () {
        $("#additem").click(function (event) {
            AddItemAjaxCall();
            $("#ItemModel").modal('hide');

        });

        $("#btnsave").click(function (event) {
            savePurchaseOrderAjaxCall();
        })

    });

</script>
