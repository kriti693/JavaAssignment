package com.example.Assignment.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Assignment.pojo.RoleModel;


public interface UserDao extends JpaRepository<RoleModel,Integer>{

}
