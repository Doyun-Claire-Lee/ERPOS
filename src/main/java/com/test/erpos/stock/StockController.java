package com.test.erpos.stock;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StockController {
	
	@Autowired
	private IStockService service;
	
	@RequestMapping(value = "/stock.action", method = { RequestMethod.GET })
	public String stock(HttpServletRequest request, HttpServletResponse response) {
		SimpleDateFormat format = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
		
		List<StockDTO> list = service.list();
		Date date = new Date();
		
		String now = format.format(date).substring(0,10);
		//System.out.println(now);
		
		request.setAttribute("list", list);
		request.setAttribute("now", now);
		
		return "stock.stock";
	}

	@RequestMapping(value = "/order.action", method = { RequestMethod.GET })
	public String order(HttpServletRequest request, HttpServletResponse response, OrderDTO dto) {
		
		int result = service.order(dto);
		

		return "order.order";
	}
	
	
}
