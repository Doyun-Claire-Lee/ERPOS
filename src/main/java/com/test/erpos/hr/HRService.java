package com.test.erpos.hr;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HRService implements IHRService {

	@Autowired
	private HRDAO dao;


	@Override
	public EmployeeDTO getEmployee(String seq) {

		return dao.getEmployee(seq);
	}

	@Override
	public List<EmployeeDTO> getList(String page) {
		
		
		//페이징 처리 관련 변수 생성하기
		int nowPage = 0;		//현재 페이지 번호
		int totalCount = 0;		//총 게시물 수
		int pageSize = 10;		//한 페이지당 출력 갯수
		int totalPage = 0;		//총 페이지 수
		int begin = 0;			//선택한 페이지의 rnum 시작 번호
		int end = 0;			//선택한 페이지의 rnum 끝 번호
		int n = 0;				//페이지바 관련 변수
		int loop = 1;			//페이지바 관련 변수
		int blockSize = 10;		//페이지바 관련 변수
		
		//모든 list.do -> list.do?page=1 로 변경
		if (page == null || page == "") {
			nowPage = 1;
		} else {
			nowPage = Integer.parseInt(page);
		}
		
		//만약 1페이지를 보려고 한다면? -> where rnum >= 1 and rnum <= 10
		//만약 2페이지를 보려고 한다면? -> where rnum >= 11 and rnum <= 20
		//만약 3페이지를 보려고 한다면? -> where rnum >= 21 and rnum <= 30
		begin = ((nowPage - 1) * pageSize) + 1;
		end = begin + pageSize - 1;
		
		//map에 담아서 넘기기
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("begin", begin + "");
		map.put("end", end + "");
		
		//총 페이지수 알아내기
		//총 페이지 = (int)(총 게시글 / 한 페이지당 출력 게시물 수) + 1
		
		//총 글 수 받아오기
		totalCount = dao.getTotalCount(map);		//검색중이라면 검색어가 같이 넘어가야 하기 때문에 map 을 넘겨야함
		totalPage = (int)Math.ceil((double)totalCount / pageSize);
		

		
		return dao.getList();

	}
	
}
