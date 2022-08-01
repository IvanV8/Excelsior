package ru.zeidler.excelsior.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zeidler.excelsior.dto.StockDTO;
import ru.zeidler.excelsior.exception.NoTickerException;
import ru.zeidler.excelsior.mapping.StockMapping;
import ru.zeidler.excelsior.model.Stocks;
import ru.zeidler.excelsior.repository.StocksRepository;
import ru.zeidler.excelsior.service.StockService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {

    @Autowired
    private final StocksRepository stockRepositary;
    @Autowired
    private final StockMapping stockMapping;

    @Override
    public List<StockDTO> GetAllStocks() {
        List<Stocks> stocks = stockRepositary.findAllBy();

        return stockMapping.stockDTO(stocks);

    }

    @Override
    public StockDTO GetStockByTicker(String ticker) {

        Stocks stock = stockRepositary.findByTicker(ticker)
                .orElseThrow(() -> new NoTickerException("No ticker"));
        StockDTO sDTO = stockMapping.stockDTO( stock);
        return sDTO;

    }
}
