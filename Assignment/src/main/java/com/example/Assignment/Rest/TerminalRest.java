package com.example.Assignment.Rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Assignment.pojo.TerminalModel;

@RequestMapping("/terminal")
public interface TerminalRest {

	@PostMapping(path = "/addNewTerminal")
	public String addNewTerminal(@RequestBody(required = true)TerminalModel requestMap);

	@GetMapping(path = "/getAllTerminal")
	public List<TerminalModel> getAllTerminal();
	
	@GetMapping(path = "/getAllTerminalByDealerid")
	public List<TerminalModel> getAllTerminalByOrganizationId(@RequestParam("oId") int oId);

}
