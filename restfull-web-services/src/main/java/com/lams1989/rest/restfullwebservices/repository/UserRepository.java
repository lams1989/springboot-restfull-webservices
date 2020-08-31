package com.lams1989.rest.restfullwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lams1989.rest.restfullwebservices.beans.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
