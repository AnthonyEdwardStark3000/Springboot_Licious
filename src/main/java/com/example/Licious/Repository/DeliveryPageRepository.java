package com.example.Licious.Repository;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Licious.Entity.T001_user_details;

@Repository
public interface DeliveryPageRepository extends CrudRepository<T001_user_details ,Long>{
	
	@Query("select productid,productname,productprice,productdate from T003_Product_Details")
	String order_details_load1();

}
