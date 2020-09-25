package com.test.erpos.stock;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StockDAO {

	@Autowired
	private SqlSessionTemplate template;
	
	public List<StockDTO> list() {

		return template.selectList("stock.list");
	}

	public int order(OrderDTO dto) {

		return template.insert("stock.order", dto);
	}


}
