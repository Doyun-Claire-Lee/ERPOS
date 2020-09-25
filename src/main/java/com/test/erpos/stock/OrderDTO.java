package com.test.erpos.stock;

import lombok.Data;

@Data
public class OrderDTO {
	
	private String seq;
	private String qty;
    private String orderdate;
    private String stock_seq;
}
