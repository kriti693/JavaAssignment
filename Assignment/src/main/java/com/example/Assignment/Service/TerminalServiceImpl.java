package com.example.Assignment.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Assignment.Dao.OrganzationDao;
import com.example.Assignment.Dao.TerminalDao;
import com.example.Assignment.customException.BusinessException;
import com.example.Assignment.pojo.OrganzationModel;
import com.example.Assignment.pojo.TerminalModel;

@Service
public class TerminalServiceImpl implements TerminalService {

	@Autowired
	TerminalDao dao;

	@Autowired
	OrganzationDao oDao;

	@Override
	public String addNewTerminal(TerminalModel requestMap) {
		try {

			dao.save(requestMap);
			return "save Successdully";
		} catch (IllegalArgumentException e) {
			throw new BusinessException("602", "given employee is null" + e.getMessage());
		} catch (Exception e) {
			throw new BusinessException("602", "Something Went Wrong in service Layer" + e.getMessage());
		}
	}

	@Override
	public List<TerminalModel> getAllTerminal() {
		try {
			List<TerminalModel> list = dao.findAll();
			return list;
		} catch (Exception e) {
			throw new BusinessException("602", "Something Went Wrong in service Layer" + e.getMessage());

		}
	}

	@Override
	public List<TerminalModel> getAllTerminalByOrganizationId(int oId) {
		try {

			List<TerminalModel> list3 = new ArrayList<>();
			List<TerminalModel> listAll = new ArrayList<>();
			List<TerminalModel> list = dao.getAllTerminalByOrganizationId(oId);
			List<OrganzationModel> list1 = oDao.getAllCustomers(oId);
			listAll.addAll(list);
			for (OrganzationModel org : list1) {
				list3 = dao.getAllTerminalByOrganizationId(org.getoId());
				listAll.addAll(list3);
			}
			return listAll;
		} catch (IllegalArgumentException e) {
			throw new BusinessException("602", "given employee is null" + e.getMessage());
		} catch (Exception e) {
			throw new BusinessException("602", "Something Went Wrong in service Layer" + e.getMessage());
		}

	}

}
