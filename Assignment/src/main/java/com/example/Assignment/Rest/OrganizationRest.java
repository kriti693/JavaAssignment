package com.example.Assignment.Rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Assignment.pojo.OrganzationModel;
import com.example.Assignment.pojo.RoleModel;


@RequestMapping("/organization")
public interface OrganizationRest {
	
	@PostMapping(path = "/createUser")
	public String createUser(@RequestBody(required = true) RoleModel role);
	
	@PostMapping(path = "/addNewUser")
	public String addNewUser(@RequestBody(required = true) OrganzationModel org);

	@GetMapping(path = "/getAllUser")
	public List<OrganzationModel> getAllUser();
	
	@GetMapping(path = "/getAllCustomers")
	public List<OrganzationModel> getAllCustomers(@RequestParam("dealerId") int dealerId);

}
