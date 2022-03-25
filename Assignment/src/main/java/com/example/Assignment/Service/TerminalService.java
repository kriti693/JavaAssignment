package com.example.Assignment.Service;

import java.util.List;

import com.example.Assignment.pojo.TerminalModel;

public interface TerminalService {

	public String addNewTerminal(TerminalModel requestMap);

	public List<TerminalModel> getAllTerminal();
	
	public List<TerminalModel> getAllTerminalByOrganizationId(int oId);

}
