package com.test.erpos.hr;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HRController {
	
	@Autowired 
	private IHRService service;
	
	@RequestMapping(value = "/hr/list.action", method = { RequestMethod.GET })
	public String hrList(HttpServletRequest request, HttpServletResponse response) {

		

		return "hr.list";
	}
	
	

}
