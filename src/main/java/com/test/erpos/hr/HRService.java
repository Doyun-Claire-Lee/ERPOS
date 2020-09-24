package com.test.erpos.hr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HRService implements IHRService {

	@Autowired
	private HRDAO dao;
	
}
