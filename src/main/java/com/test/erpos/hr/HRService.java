package com.test.erpos.hr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HRService implements IHRService {

	@Autowired
	private HRDAO dao;

	@Override
	public List<EmployeeDTO> getList() {
		
		return dao.getList();
	}

	@Override
	public EmployeeDTO getEmployee(String seq) {

		return dao.getEmployee(seq);
	}
	
}
