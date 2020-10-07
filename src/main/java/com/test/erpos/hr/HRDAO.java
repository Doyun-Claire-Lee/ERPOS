package com.test.erpos.hr;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HRDAO {
	
	@Autowired
	private SqlSessionTemplate template;

	public List<EmployeeDTO> getList() {
		
		return template.selectList("hr.list");
	}

	public EmployeeDTO getEmployee(String seq) {

		return template.selectOne("hr.employee");
	}

	public int getTotalCount(HashMap<String, String> map) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
