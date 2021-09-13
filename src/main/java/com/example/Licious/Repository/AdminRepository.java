package com.example.Licious.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Licious.Entity.T004_Admin_Details;

@Repository
public interface AdminRepository extends JpaRepository<T004_Admin_Details, Long> {

	@Query("select Adminid,Adminname from T004_Admin_Details where username=?1 and password=?2")
	String admin_check(String username,String password);
	
	
}
