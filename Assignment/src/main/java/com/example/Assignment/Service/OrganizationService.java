package com.example.Assignment.Service;

import java.util.List;

import com.example.Assignment.pojo.OrganzationModel;
import com.example.Assignment.pojo.RoleModel;

public interface OrganizationService {
	
	public String createUser(RoleModel role);
	
	public String addNewUser(OrganzationModel org);

	public List<OrganzationModel> getAllUser();
	
	public List<OrganzationModel> getAllCustomers(int dealerId);

	

}
