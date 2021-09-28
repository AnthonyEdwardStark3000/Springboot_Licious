$(document).ready(function(){
	
	alert("Hi from js");
  $("#save").click(function(){
   alert("Jquery");
   
  var productname=$("#input-name").val();
  var productprice=$("#input-price").val();
  var productdate=$("#date").val();
  var productquantity=$("#quantity").val();//variable names are declared in small to avoid namespace error
$.ajax({ 
        type: "POST",
        dataType: "json",
        contentType: "application/json",
        url: "http://localhost:8003/productsave",
         data: JSON.stringify({
            "productname": productname,  
            "productprice":productprice,
            "productdate":productdate,
            "productquantity":productquantity,
            
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
