var modal_orders=[];

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
        
        var count=3;
        for(var i=0;i<orderDetails.length;i++)
        {
       var orders=orderDetails[i].split(",");
 
      
        
        
        if(count==3)
        {
	    html+="<div class='container'>";
        html+="<div class='row'>";
         }
        
        
        html+="<div class='col-md-4 col-sm-6 lg-3' style='margin-top: 10px;'>";
        html+="<div class='card'>";
        html+="<div class='card-body'>";
   		html+="<h5 class='card-title'>Product name:"+orders[1]+"</h5>";
    	html+="<p class='card-text'>Product Price:"+orders[2]+"</p>";
    	html+="<p class='card-text'>Product Date:"+orders[3]+"</p>";
    	html+="<button type='button' onclick='clicked(\""+orders+"\")' class='btn btn-info btn-lg' data-toggle='modal' data-target='#myModal'>Open Small Modal</button>";
  		html+="</div>";
		html+="</div>";
		html+="</div>";
		
		if(count==2)
		{
		html+="</div>";
		html+="</div>";
		count=0;
		}
		
		count++;
	    
	   
	    
	    
        }  
        $("#card").append(html); 
       }
    });
	}
		   
      function clicked(orders)
      {


	   modal_orders=orders.split(",");
	   $("#productname").val(modal_orders[1]);
	   
       }
       
       function save()
       {

			alert(modal_orders[1]);	
			alert(modal_orders[2]);	
	
		}
      
      
      
      	
	
	