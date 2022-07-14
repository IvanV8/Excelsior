package ru.zeidler.excelsior.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.zeidler.excelsior.dto.StockDTO;
import ru.zeidler.excelsior.mapping.StockMapping;
import ru.zeidler.excelsior.model.Stocks;
import ru.zeidler.excelsior.repository.StocksRepository;
import ru.zeidler.excelsior.service.StockService;

import java.util.List;
@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {

    private final StocksRepository stockRepositary;
    private final StockMapping stockMapping;

    @Override
    public List<StockDTO> GetAllStocks() {
        List<Stocks> stocks = stockRepositary.findAllBy();

        return stockMapping.stockDTO(stocks);

    }

    @Override
    public StockDTO GetStockByTicker(String ticker) {

        StockDTO sDTO = stockMapping.stockDTO(stockRepositary.findByTicker(ticker));
        return sDTO;

    }
}
