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
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <title>Purchase Order Form</title>
</head>
<body>
<div class="graphic-container">
    <div>Purchase Order Form</div>

    <sform:form methode="POST" modelAttribute="PurchaseOrder">

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

                <div class=" col-md-3">
                    <button type="button" data-toggle="modal" data-target="#ItemModel" class="btn btn-info">Add more Items</button>
                    <div class="modal fade" id="ItemModel" role="form">
                        <div class="modal-dialog">
                            <div class="modal-content">
                                <div class="modal-header">
                                    <h3> Add Item To Puchase</h3>
                                </div>
                                <div class="modal-body">
                                    <sform:form modelAtribute="product" method="POST">
                                        <div><label>Item</label></div>
                                        <div>
                                            <sform:select path="item" items="${itemList}" itemValue="id" itemLabel="name"></sform:select>
                                        </div>
                                        <div>
                                            <label>Quantity</label>
                                        </div>
                                        <div>
                                            <sform:input type="text" path="quantity" id="quantity"/>
                                        </div>
                                    </sform:form>

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
                <label class>Item List</label>
                <div class="col-md-6">
                    <table>
                        <thead>
                        <tr><td>Item Name</td>
                            <td>Item Quantity</td>
                            <td>Price</td>
                            <td>Line Total</td>
                            <td>Remove</td>
                        </tr>
                        </thead>
                    </table>
                </div>
            </div>
        </div>
    </sform:form>
</div>
</body>
</html>
