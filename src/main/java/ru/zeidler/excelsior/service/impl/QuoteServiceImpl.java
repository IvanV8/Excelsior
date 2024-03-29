package ru.zeidler.excelsior.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.zeidler.excelsior.dto.QuoteDTO;
import ru.zeidler.excelsior.dto.StockDTO;
import ru.zeidler.excelsior.mapping.QuoteMapping;
import ru.zeidler.excelsior.mapping.StockMapping;
import ru.zeidler.excelsior.model.Quote;
import ru.zeidler.excelsior.model.Stocks;
import ru.zeidler.excelsior.repository.QuoteRepository;
import ru.zeidler.excelsior.repository.StocksRepository;
import ru.zeidler.excelsior.service.QuoteService;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuoteServiceImpl implements QuoteService {

    @Autowired
    private QuoteRepository quoteRepository;

    @Autowired
    private StocksRepository stockRepository;

    @Autowired
    private QuoteMapping quoteMapping;

    @Autowired
    private StockMapping stockMapping;


    @Override
    public List<QuoteDTO> GetQuotes(Date day) {

        List<Quote> quotes = quoteRepository.findByPeriodIs(day);
        return quoteMapping.quoteDTO(quotes);
    }

    @Override
    public List<QuoteDTO> GetQuotes(String ticker, Date d1, Date d2) {
        List<Quote> quotes = quoteRepository.findByStock_TickerEqualsAndPeriodIsBetween(ticker, d1, d2);
        return quoteMapping.quoteDTO(quotes);

    }
    @Override
    public void SaveQuote(QuoteDTO quoteDTO) {
        Quote  q = quoteMapping.Quote(quoteDTO);
        quoteRepository.save(q);

    }
}
