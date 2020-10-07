package com.test.erpos.hr;

import java.util.List;

public interface IHRService {

	List<EmployeeDTO> getList(String page);

	EmployeeDTO getEmployee(String seq);

}
