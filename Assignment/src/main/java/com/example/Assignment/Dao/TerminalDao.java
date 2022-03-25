package com.example.Assignment.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Assignment.pojo.TerminalModel;

 

public interface TerminalDao extends JpaRepository<TerminalModel,Integer>{
	
	
	@Query(value= "select t.tid,t.tname,t.serial_no,t.o_id_oid from terminal t where t.o_id_oid  =:oId" ,nativeQuery = true)
	
	public List<TerminalModel>getAllTerminalByOrganizationId(@Param("oId") int oId);



}
