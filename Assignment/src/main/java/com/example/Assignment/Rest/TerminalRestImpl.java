package com.example.Assignment.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.Assignment.Service.TerminalService;
import com.example.Assignment.customException.ControllerException;
import com.example.Assignment.pojo.TerminalModel;

@RestController
public class TerminalRestImpl implements TerminalRest{

	@Autowired
	TerminalService terminalService;
	
	@Override
	public String addNewTerminal(TerminalModel requestMap) {
		try {
			return  terminalService.addNewTerminal(requestMap);
		} catch (Exception e) {
			throw new ControllerException("501", "Something Went Wrong in Rest Layer" + e.getMessage());
		}
	}

	@Override
	public  List<TerminalModel>  getAllTerminal() {
		try {
			return  terminalService.getAllTerminal();
		} catch (Exception e) {
			throw new  ControllerException("502", "Something Went Wrong in Rest Layer" + e.getMessage());
		}
	}
	
	 
	@Override
	public List<TerminalModel> getAllTerminalByOrganizationId(int oId){
		try {
			return  terminalService.getAllTerminalByOrganizationId(oId);
		} catch (Exception e) {
			throw new  ControllerException("504", "Something Went Wrong in Rest Layer" + e.getMessage());
		}
	}

}
