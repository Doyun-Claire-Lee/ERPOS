package com.test.erpos.hr;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HRDAO {
	
	@Autowired
	private SqlSessionTemplate template;
	

}
