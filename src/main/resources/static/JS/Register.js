$(document).ready(function(){
	
	alert("Hi from js");
  $("#save").click(function(){
   alert("Jquery");
   
  var firstname=$("#fname").val();
  var lastname=$("#lname").val();
  var username=$("#uname").val();
  var Email_Id=$("#email").val();
  var password=$("#password").val();
  var Confirm_password=$("#cnpass").val();
  
$.ajax({ 
        type: "POST",
        dataType: "json",
        contentType: "application/json",
        url: "http://localhost:8003/Save",
         data: JSON.stringify({
            "firstname": firstname,  
            "lastname": lastname,
            "username":username,
            "password":password,
            "email":Email_Id,
            }),
            async: false,
        success: function(data){ 
	alert(data["result"]);
	  alert(JSON.stringify({data}));
	    alert("Normal call");    
            console.log(data);
        }
    });

  });
});
