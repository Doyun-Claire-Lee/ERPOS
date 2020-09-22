package com.test.erpos;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	

	@RequestMapping(value = "/test.action", method = { RequestMethod.GET })
	public String test(HttpServletRequest request, HttpServletResponse response) {
		
		
		

		return "test";
	}
	
	
}
