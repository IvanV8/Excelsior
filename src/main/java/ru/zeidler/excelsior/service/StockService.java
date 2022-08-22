package ru.zeidler.excelsior.service;

import org.springframework.stereotype.Service;
import ru.zeidler.excelsior.dto.StockDTO;

import java.util.List;

@Service
public interface StockService {

    List<StockDTO> GetAllStocks();

    StockDTO GetStockByTicker(String ticker);

}

