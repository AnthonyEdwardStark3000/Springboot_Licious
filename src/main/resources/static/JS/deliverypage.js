
function openNav() {
  document.getElementById("mySidenav").style.width = "250px";
}

function closeNav() {
  document.getElementById("mySidenav").style.width = "0";
}
$(document).ready(function(){
	order_details_load();
	});
	
	function order_details_load()
	{
		$.ajax({ 
        type: "GET",
        dataType: "json",
        contentType: "application/json",
        url: "http://localhost:8003/order_details_load",
            async: false,
        success: function(data){ 
	   alert("Welcome : "+data["firstname"] +data["lastname"]);
	    window.location.href="http://localhost:8003/Signup"
	        }
    });
	}