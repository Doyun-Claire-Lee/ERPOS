package com.test.erpos.hr;

import java.util.List;

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
	public String hrList(HttpServletRequest request, HttpServletResponse response, String page) {
		
		//데이터 가져오기
		List<EmployeeDTO> list = service.getList(page);
		
		request.setAttribute("list", list);
		return "hr.list";
	}
	
	@RequestMapping(value = "/hr/addemployee.action", method = { RequestMethod.GET })
	public String hrAddEmployee(HttpServletRequest request, HttpServletResponse response) {

		

		return "hr.addemployee";
	}
	
	@RequestMapping(value = "/hr/viewemployee.action", method = { RequestMethod.GET })
	public String hrViewEmployee(HttpServletRequest request, HttpServletResponse response, String seq) {
		
		//1. 데이터 받아오기
		//2. 데이터 가져오기
		//3. 데이터 전달하기 + JSP 호출
		
		EmployeeDTO dto = service.getEmployee(seq);
		
		request.setAttribute("dto", dto);
		return "hr.viewemployee";
	}
	
	@RequestMapping(value = "/hr/attendlist.action", method = { RequestMethod.GET })
	public String attendList(HttpServletRequest request, HttpServletResponse response) {

		

		return "hr.attendlist";
	}
	

}
