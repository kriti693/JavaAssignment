package com.example.Assignment.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.Assignment.Service.OrganizationService;
import com.example.Assignment.customException.ControllerException;
import com.example.Assignment.pojo.OrganzationModel;
import com.example.Assignment.pojo.RoleModel;

@RestController
public class OrganizationRestImpl implements OrganizationRest {

	@Autowired
	OrganizationService service;
	
	@Override
	public String createUser(RoleModel role) {
		try {
			return service.createUser(role);
		} catch (Exception e) {
			throw new ControllerException("501", "Something Went Wrong in Rest Layer" + e.getMessage());
		}
	}

	@Override
	public String addNewUser(OrganzationModel org) {
		try {
			return service.addNewUser(org);
		} catch (Exception e) {
			throw new ControllerException("501", "Something Went Wrong in Rest Layer" + e.getMessage());
		}
	}

	@Override
	public List<OrganzationModel> getAllUser() {
		try {
			return service.getAllUser();
		} catch (Exception e) {
			throw new ControllerException("502", "Something Went Wrong in Rest Layer" + e.getMessage());
		}
	}
	
	@Override
	public List<OrganzationModel> getAllCustomers(int dealerId){
		try {
			//System.out.println("DealerId"+dealerId);
			//return null;
			return service.getAllCustomers(dealerId);
			
		} catch (Exception e) {
			throw new ControllerException("503", "Something Went Wrong in Rest Layer" + e.getMessage());
		}
		
	}

	
}
