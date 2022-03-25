package com.example.Assignment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Assignment.Dao.OrganzationDao;
import com.example.Assignment.Dao.UserDao;
import com.example.Assignment.customException.BusinessException;
import com.example.Assignment.pojo.OrganzationModel;
import com.example.Assignment.pojo.RoleModel;

@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	OrganzationDao dao;
	
	@Autowired
	UserDao uDao;
	
	@Override
	public String createUser(RoleModel role){
		try {

			uDao.save(role);
			return "User Save Successfully";

		} catch (IllegalArgumentException e) {
			throw new BusinessException("602", "given employee is null" + e.getMessage());
		} catch (Exception e) {
			throw new BusinessException("602", "Something Went Wrong in service Layer" + e.getMessage());
		}

	}

	@Override
	public String addNewUser(OrganzationModel org) {
		try {

			dao.save(org);
			return "Save Successfully";

		} catch (IllegalArgumentException e) {
			throw new BusinessException("602", "given employee is null" + e.getMessage());
		} catch (Exception e) {
			throw new BusinessException("602", "Something Went Wrong in service Layer" + e.getMessage());
		}

	}

//	private boolean validateAddNewCustomer(Map<String, String> requestMap) {
//		if (requestMap.containsKey("oName") && requestMap.containsKey("oRole")&& requestMap.containsKey("dId")) {
//			return true;
//		}
//		return false;
//	}

//	private OrganzationModel getCustomerFromMap(Map<String, String> requestMap) {
//		OrganzationModel organzation = new  OrganzationModel();
//		organzation.setoName(requestMap.get("oName"));
//		organzation.setoRole(requestMap.get("oRole"));
//		 organzation.setdId(organzation);
//		return organzation;
//	}

	@Override
	public List<OrganzationModel> getAllUser() {
		try {
			List<OrganzationModel> list = dao.findAll();

			return list;
		} catch (Exception e) {
			throw new BusinessException("602", "Something Went Wrong in service Layer" + e.getMessage());

		}

	}

	public List<OrganzationModel> getAllCustomers(int dealerId) {
		try {
			
			List<OrganzationModel> list = dao.getAllCustomers(dealerId);
			System.out.println("LISTTTTT"+list);
			if (list.isEmpty()) {
				throw new BusinessException("603", "List is Empty");
			}
			return list;
		} catch (IllegalArgumentException e) {
			throw new BusinessException("602", "given employee is null" + e.getMessage());
		} catch (Exception e) {
			throw new BusinessException("602", "Something Went Wrong in service Layer" + e.getMessage());
		}
	}

}
