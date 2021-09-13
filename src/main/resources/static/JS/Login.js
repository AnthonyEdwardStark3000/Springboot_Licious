$(document).ready(function(){
	
	alert("Hi from js");
  $("#signsave").click(function(){
   alert("Jquery");
   
  var username=$("#uname").val();
  var password=$("#pwrd").val();
  
$.ajax({ 
        type: "POST",
        dataType: "json",
        contentType: "application/json",
        url: "http://localhost:8003/login_check",
         data: JSON.stringify({
            "username": username,  
            "password": password,
            }),
            async: false,
        success: function(data){ 
	   alert("Welcome : "+data["firstname"] +data["lastname"]);
	    window.location.href="http://localhost:8003/Signup"
	        }
    });

  });
});
