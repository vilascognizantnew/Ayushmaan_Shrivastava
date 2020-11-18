package com.cts.security.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.security.models.DaoUser;

@Repository
public interface UserDao extends CrudRepository<DaoUser, Integer> {

	DaoUser findByUsername(String username);

}