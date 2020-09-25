package com.test.erpos.stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService implements IStockService{

	@Autowired
	private StockDAO dao;
	
	
	@Override
	public List<StockDTO> list() {

		return dao.list();
	}
	
	@Override
	public int order(OrderDTO dto) {

		return dao.order(dto);
	}

	
	
}
