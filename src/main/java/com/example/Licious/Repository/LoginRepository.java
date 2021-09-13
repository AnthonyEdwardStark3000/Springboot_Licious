package com.example.Licious.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Licious.Entity.T001_user_details;

@Repository
public interface LoginRepository extends CrudRepository<T001_user_details, Long> {

	@Query("select a.userid , b.firstname,b.lastname from T001_user_details a, T002_user_profile_details b where a.userid = b.userid and a.username =?1 and a.password =?2")
	String login_check(String username,String password);
	
}
