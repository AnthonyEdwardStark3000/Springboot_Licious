
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
        var orderDetails=data["order_details_load"];
        alert(orderDetails);	
        var html="";
        for(var i=0;i<orderDetails.length;i++)
        {
       var orders=orderDetails[i].split(",");
 
      alert(orders[1]);
        
        html+="<div class='card'>";
        html+="<div class='card-body'>";
   		html+="<h5 class='card-title'>"+orders[1]+"</h5>";
    	html+="<p class='card-text'>With supporting text below as a natural lead-in to additional content.</p>";
  		html+="</div>";
		html+="</div>";
	      	
        }  
        $("#card").append(html);
}
    });
	}