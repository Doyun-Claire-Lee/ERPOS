package com.test.erpos.stock;

import java.util.List;

public interface IStockService {

	List<StockDTO> list();

	int order(OrderDTO dto);


}
