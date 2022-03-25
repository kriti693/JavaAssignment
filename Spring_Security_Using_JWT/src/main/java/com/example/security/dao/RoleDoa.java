package com.example.security.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.security.pojo.Role;

@Repository
public interface RoleDoa extends CrudRepository<Role,String> {

}
