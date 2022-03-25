package com.example.Assignment.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.Assignment.pojo.OrganzationModel;

public interface OrganzationDao extends JpaRepository<OrganzationModel, Integer> {

	@Query(value = "select o.oid,o.oname,o.orole,o.d_id_oid from organzation o where o.d_id_oid  =:dealerId", nativeQuery = true)

	public List<OrganzationModel> getAllCustomers(@Param("dealerId") int dealerId);

}
