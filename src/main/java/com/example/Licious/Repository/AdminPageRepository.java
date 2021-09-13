package com.example.Licious.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Licious.Entity.T003_Product_Details;

@Repository
public interface AdminPageRepository extends CrudRepository<T003_Product_Details,Long>{
	

}
