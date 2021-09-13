package com.example.Licious.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Licious.Entity.T001_user_details;

public interface RegisterRepository extends CrudRepository<T001_user_details, Long> {

}
