function  validateEmployee() {

    var firstName = $('#firstName').val();
    var firstName = $('#lastName').val();
    var firstName = $('#nic').val();
    var firstName = $('#mobile').val();
    var firstName = $('#telephone').val();
    var firstName = $('#dob').val();
    var firstName = $('#addressLine1').val();
    var firstName = $('#addressline2').val();
    var firstName = $('#city').val();
    var firstName = $('#email').val();
    var firstName = $('#designation').val();
    var firstName = $('#gender').val();
    var firstName = $('#epf').val();
    var firstName = $('#etf').val();

    if(firstName.length < 3){

        $('#firstName').after("<Span>Please enter a valid name from jquery</Span>");

    }

    if(lastName.length < 3){

        $('#lastName').after("<Span>Please enter a valid name from jquery</Span>");

    }


    if(nic.length > 0){

        var nicRegex = /^([0-9]{9}[V|v|x|X])|([0-9]{12})^/
        var valNic = nicRegex.test(nic);
        if(!valNic) {
            $('#nic').after("<Span>Please enter a valid nic from jquery</Span>");
        }
    }

}