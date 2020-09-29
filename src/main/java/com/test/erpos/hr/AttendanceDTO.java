package com.test.erpos.hr;

import lombok.Data;

@Data
public class AttendanceDTO {
	
	private String seq;
	private String member_seq;
	private String regdate;
	private String attendFlag;
	private String delflag;

}
