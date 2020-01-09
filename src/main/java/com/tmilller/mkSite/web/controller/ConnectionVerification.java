package com.tmilller.mkSite.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("validate")
public class ConnectionVerification {
	
	
	public ConnectionVerification() {

	}
	
	
	@RequestMapping(name="connectivity", value="/connectivity", method = { RequestMethod.GET, RequestMethod.POST })
	@ResponseStatus(HttpStatus.OK)
    @ResponseBody
	public String returnMessage(HttpServletRequest request, 
	        HttpServletResponse response)  {
		return "connection is valid";
	}

	
}

