package ru.zeidler.excelsior.service;

import ru.zeidler.excelsior.dto.StockDTO;

import java.util.List;

public interface StockService {

    List<StockDTO> GetAllStocks();

    StockDTO GetStockByTicker(String ticker);
}

