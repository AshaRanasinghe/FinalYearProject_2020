<%--
  Created by IntelliJ IDEA.
  User: Asha
  Date: 2/29/2020
  Time: 11:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css">
          rel="stylesheet"/>
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
    <link href="<c:url value='/css/app.css'/>"/>

    <title>Employee Registration</title>
</head>

<body>

<script>

    $( document ).ready(function() {

        $("#submitbutton").click(function(event){

            event.preventDefault();
            var status = validateEmployee();

            if(status){

                $("#employeeform").unbind('submit').submit();
            }
        });

        function validateEmployee(){

            var firstName   = $('#firstName').val();
            var lastName    = $('#lastName').val();
            var nic         = $('#nic').val();
            var mobile      = $('#mobile').val();
            var home        = $('#home').val();
            var dob         = $('#dob').val();
            var addressLine1 = $('#addressLine1').val();
            var city        = $('#city').val();

            var status = true;


            if(firstName.length < 3){

                $('#firstName').after("<Span>Please enter a valid name from jquery</Span>");
                status = false;
            }

            if(lastName.length < 3){

                $('#lastName').after("<Span>Please enter a valid name from jquery</Span>");
                status = false;
            }


            if(nic.length > 0){

                var nicRegex = /^([0-9]{9}[V|v|x|X])|([0-9]{12})^/
                var valNic = nicRegex.test(nic);
                if(!valNic) {
                    $('#nic').after("<Span>Please enter a valid nic from jquery</Span>");
                    status = false;
                }

              //  mobile validation
                if(mobile.length > 0){

                    var mobileRegex = /^([0-9]{10})$/

                    var valMobile = mobileRegex.test(mobile);

                    if(!valMobile) {
                        $('#mobile').after("<Span>Please enter a valid mobile number from jquery</Span>");
                        status = false;
                    }
                }
                //Home Validation
                if(home.length > 0){

                   // var homeRegex = /^([0-9]{10})$/
                    var homeRegex = /^(0|[+94]{3})?[7-9][0-9]{9}$/;
                    var valHome = homeRegex.test(home);

                    if(!valHome) {
                        $('#home').after("<Span>Please enter a valid home number from jquery</Span>");
                        status = false;
                    }
                }
                //address and city
                if(addressLine1.length <= 0){

                    $('#addressLine1').after("<Span>Please enter the address</Span>");
                    status = false;
                }

                if(city.length <= 0){

                    $('#city').after("<Span>Please enter the city</Span>");
                    status = false;
                }

            }

            return status;
        }});

</script>



        <div class="generic-container"></div>
            <div><h1>Employee Registration Form</h1></div>
                <sform:form method="POST" modelAttribute="employee" id="employeeform">

                    <div class="row">
                        <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="firstName">First Name</label>
                        <div class="col-md-9">
                            <sform:input type="text" path="firstName" id="firstName" for="firstName" class="form-control input-sm"></sform:input>
                            <div class="has-error">
                                <sform:errors path="firstName" class="help-inline"/>
                            </div>
                         </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="form-group col-md-12">
                            <label class="col-md-3 control-label" for="lastName">Last Name</label>
                            <div class="col-md-9">
                                <sform:input type="text" path="lastName" id="lastName" for="lastName" class="form-control input-sm"></sform:input>
                                <div class="has-error">
                                    <sform:errors path="lastName" class="help-inline"/>
                                </div>
                        </div>
                        </div>
                    </div>

                    <div class="row">
                        <div class="form-group col-md-12">
                            <label class="col-md-3 control-label" for="nic">NIC</label>
                            <div class="col-md-9">
                                <sform:input type="text" path="nic" id="nic" for="NIC" class="form-control input-sm"></sform:input>
                                <div class="has-error">
                                    <sform:errors path="nic" class="help-inline"/>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="mobile">Mobile</label>
                        <div class="col-md-9">
                            <sform:input type="text" path="mobile" id="mobile" for="mobile" class="form-control input-sm"></sform:input>
                            <div class="has-error">
                                <sform:errors path="mobile" class="help-inline"/>
                            </div>
                        </div>
                    </div>
                    </div>

                    <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="telephone">Telephone</label>
                        <div class="col-md-9">
                            <sform:input type="text" path="telephone" id="telephone" for="telephone" class="form-control input-sm"></sform:input>
                            <div class="has-error">
                                <sform:errors path="telephone" class="help-inline"/>
                            </div>
                        </div>
                    </div>
                    </div>

                    <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="dob">Birthday</label>
                        <div class="col-md-9">
                            <sform:input type="date" path="dob" id="dob" for="dob" class="form-control input-sm"></sform:input>
                            <div class="has-error">
                                <sform:errors path="dob" class="help-inline"/>
                            </div>
                        </div>
                    </div>
                    </div>

                    <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="addressLine1">Address Line 1</label>
                        <div class="col-md-9">
                            <sform:input type="text" path="addressLine1" id="addressLine1" for="text" class="form-control input-sm"></sform:input>
                            <div class="has-error">
                                <sform:errors path="addressLine1" class="help-inline"/>
                            </div>
                        </div>
                    </div>
                    </div>

                    <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="addressline2">Address Line 2</label>
                        <div class="col-md-5">
                            <sform:input type="text" path="addressline2" id="addressline2" for="addressline2" class="form-control input-sm"></sform:input>
                            <div class="has-error">
                                <sform:errors path="addressline2" class="help-inline"/>
                            </div>
                        </div>
                    </div>
                    </div>

                    <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="city">City</label>
                        <div class="col-md-5">
                            <sform:input type="text" path="city" id="city" for="city" class="form-control input-sm"></sform:input>
                            <div class="has-error">
                                <sform:errors path="city" class="help-inline"/>
                            </div>
                        </div>
                    </div>
                    </div>

                   <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="image">Image</label>
                        <div class="col-md-9">
                            <sform:input type="text" path="image" id="image" for="image" class="form-control input-sm"></sform:input>
                            <div class="has-error">
                                <sform:errors path="image" class="help-inline"/>
                            </div>
                        </div>
                    </div>
                    </div>

                    <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="email">Email</label>
                        <div class="col-md-9">
                            <sform:input type="text" path="email" id="email" for="email" class="form-control input-sm"></sform:input>
                            <div class="has-error">
                                <sform:errors path="email" class="help-inline"/>
                            </div>
                        </div>
                    </div>

                   <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="designation">Designation</label>
                        <div class="col-md-9">
                            <sform:input type="text" path="designation" id="designation" for="designation" class="form-control input-sm"></sform:input>
                            <div class="has-error">
                                <sform:errors path="designation" class="help-inline"/>
                            </div>
                        </div>
                    </div>

                   < div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="gender">Gender</label>
                        <div class="col-md-9">
                            <sform:input type="text" path="gender" id="gender" for="gender" class="form-control input-sm"></sform:input>
                            <div class="has-error">
                                <sform:errors path="gender" class="help-inline"/>
                            </div>
                        </div>
                    </div>

                   < div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="epf">EPF</label>
                        <div class="col-md-9">
                            <sform:input type="text" path="epf" id="epf" for="epf" class="form-control input-sm"></sform:input>
                            <div class="has-error">
                                <sform:errors path="epf" class="help-inline"/>
                            </div>
                        </div>
                    </div>

                    <div class="row">
                    <div class="form-group col-md-12">
                        <label class="col-md-3 control-label" for="etf">ETF</label>
                        <div class="col-md-9">
                            <sform:input type="text" path="etf" id="etf" for="etf" class="form-control input-sm"></sform:input>
                            <div class="has-error">
                                <sform:errors path="etf" class="help-inline"/>
                            </div>
                        </div>
                    </div>
                    </div>

                       <div class="row">
                           <div class="form-group col-md-12">

                               <label class="col-md-3 control-lable" for="genderId">Gender</label>
                               <div class="col-md-5">
                                   <sform:select path="genderId" items="${genderList}" multiple="false" itemValue="id"

                                                 itemLabel="name" class="form-control input-sm" />
                                   <div class="has-error">
                                       <sform:errors path="genderId" class="help-inline"/>
                                   </div>

                               </div>
                           </div>
                       </div>


                   <c:choose>
                       <c:when test="${edit}">
                       <input type="submit" value="Update" class="btn btn-primary btn-sm"/> or <a

                           href="<c:url value='/' />">Cancel</a>
                       </c:when>
                       <c:otherwise>
                       <input type="submit" id="submitbutton" value="Save" class="btn btn-primary btn-sm"/> or <a

                           href="<c:url value='/' />">Cancel</a>
                       </c:otherwise>
                       </c:choose>



                   </sform:form>


</body>
</html>
